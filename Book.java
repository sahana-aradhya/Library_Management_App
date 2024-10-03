public class Book {

    private String title;
    private String description;
    private String author;
    private String genre;
    private String isbn;
    private int TotalNumOfBook;
    private int TotalNumOfBookCheckedOut;

    public Book(String title, String description, String author, String isbn, String genre,int TotalNumOfBook,int TotalNumOfBookCheckedOut) {
        this.author = author;
        this.description = description;
        this.genre = genre;
        this.isbn = isbn;
        this.title = title;
        this.TotalNumOfBook = TotalNumOfBook;
        this.TotalNumOfBookCheckedOut = TotalNumOfBookCheckedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public int getTotalNumOfBook() {
        return TotalNumOfBook;
    }
    
    public int getTotalNumOfBookCheckedOut() {
        return TotalNumOfBookCheckedOut;
    }

    public boolean checkout () {
        if(TotalNumOfBookCheckedOut >= TotalNumOfBook) {
            return false;
        }
        TotalNumOfBookCheckedOut++;
            return true;
    }

    public boolean checkin() {
        if(TotalNumOfBookCheckedOut <= 0){
        return false;
        }
        TotalNumOfBookCheckedOut--;
        return true;
    }
}