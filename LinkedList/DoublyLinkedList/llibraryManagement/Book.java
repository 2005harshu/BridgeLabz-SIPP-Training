package llibraryManagement;

public class Book {
    String title, author, genre, availabilityStatus;
    int bookID;
    Book prev, next;

    public Book(String title, String author, String genre, int bookID, String status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.availabilityStatus = status;
        this.prev = null;
        this.next = null;
    }
}
