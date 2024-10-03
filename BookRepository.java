import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
    books.add(new Book("To kill a mockingbird", null,"Harper Lee", "978-0-06-093546-7","Southern Gothic, Coming-of-age",10, 5));
    books.add(new Book("Pride and Prejudice", null,"Jane Austen", "978-0-19-953556-9","Romance, Satire", 5 , 4));
    books.add(new Book("1987", null,"John Orwell", "978-0-452-35823-4","Southern Gothic, Horror Fiction", 17, 1));
    books.add(new Book("The Great Gatsby", null,"F. Scott Fitzgerald", "978-0-7432-7356-5","Tragedy, Historical Fiction", 19, 7));
    books.add(new Book("Moby-Dick", null,"Herman Melville", "978-0-14-243724-7","Adventure, Epic, Tragedy", 1, 1));
    books.add(new Book("1984", null,"George Orwell", "978-0-452-28423-4","Dystonpian, Political Fiction", 13, 10));
    }

    public Book findByIsbn(String isbn) {
        for(Book book: books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksfound = new ArrayList<>();
        for(Book bookbykeyword : books) {
            if(bookbykeyword.getTitle().contains(keyword)){
                booksfound.add(bookbykeyword);
            }
        }
        return booksfound;
    }
}
