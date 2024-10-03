import java.util.ArrayList;
public class LibraryApp {

    private BookRepository repo = new BookRepository(); // private coz only libapp should be able to access it but should not be accessed by main or other
    
    public void searchByIsbn(String isbn) {
        Book book = repo.findByIsbn(isbn);
        if(book != null) {
            System.out.println("The book you searched using ISBN number is found with the following details:");
            System.out.printf(" Title : %s \n Auther : %s \n Genre : %s", book.getTitle(),book.getAuthor(),book.getGenre());
            System.out.println("\n\n");
        }
        else {
            System.out.println("Sorry i couldn't find the book. Enter the proper ISBN number");
        }
    }

    public void searchByTitle(String keyword) {
        ArrayList<Book> bookKeyword  = repo.findByTitle(keyword);
        System.out.printf("%d books where found \n",bookKeyword.size());
        
        System.out.println("The book you searched by keyword are as follows:");
        for(Book i: bookKeyword) {
            System.out.printf(" Title : %s \n Auther : %s \n Genre : %s \n ISNB: %s", i.getTitle(),i.getAuthor(),i.getGenre(),i.getIsbn());
            System.out.println("\n\n");
    
        }
    }

    public void checkout(String isbn) {
        Book bookOut = repo.findByIsbn(isbn);
        if(bookOut != null){
            if(bookOut.checkout()){
            
            System.out.println("\nThe book with "+isbn+"ISBN checkout successfully");
            System.out.printf(" Title : %s \n Auther : %s \n Genre : %s \n", bookOut.getTitle(),bookOut.getAuthor(),bookOut.getGenre());
        }
    
        else {
            System.out.println("Check out failed ");
            System.out.printf(" Title : %s \n Auther : %s \n Genre : %s \n", bookOut.getTitle(),bookOut.getAuthor(),bookOut.getGenre());
            System.out.println("Reason: More book checked out more than total quantity.");
        }
    }
    }

    public void checkin(String isbn) {
        Book bookin = repo.findByIsbn(isbn);
        if(bookin != null) {
            if(bookin.checkin()){
            System.out.println("\nThe book with "+isbn+"ISBN checkout successfully");
            System.out.printf(" Title : %s \n Auther : %s \n Genre : %s \n", bookin.getTitle(),bookin.getAuthor(),bookin.getGenre()); 
        }
        else {
            System.out.println("\nChcek in failed");
            System.out.println("\nReson:There is no book with "+isbn+"ISBN.");
        } 
    }
    
    else {
        System.out.println("\nCheck-in failed");
    System.out.println("\nReason: There is no book with ISBN: " + isbn);
    }
    }
}