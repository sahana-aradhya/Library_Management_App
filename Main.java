public class Main {
    public static void main (String [] args) {

        LibraryApp app = new LibraryApp();
        app.searchByIsbn("978-0-06-093546-7");
        app.searchByTitle("19");
        app.checkout("978-0-14-243724-7");
        app.checkin("123445");
        
    }
}
