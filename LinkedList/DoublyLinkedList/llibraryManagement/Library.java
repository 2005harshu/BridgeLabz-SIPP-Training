package llibraryManagement;

public class Library {
    Book head = null;
    Book tail = null;

    // Add book at position
    public void addBook(String title, String author, String genre, int bookID, String status, int position) {
        Book newBook = new Book(title, author, genre, bookID, status);
        if (head == null || position == 1) {
            newBook.next = head;
            if (head != null) head.prev = newBook;
            head = newBook;
            if (tail == null) tail = newBook;
        } else {
            Book temp = head;
            int i = 1;
            while (temp.next != null && i < position - 1) {
                temp = temp.next;
                i++;
            }
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) temp.next.prev = newBook;
            temp.next = newBook;
            if (newBook.next == null) tail = newBook;
        }
    }

    // Remove book by ID
    public void removeBook(int bookID) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID)
            temp = temp.next;
        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;
        System.out.println("Book removed.");
    }

    // Search book by title or author
    public void searchBook(String keyword) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Book not found.");
    }

    // Update book availability
    public void updateAvailability(int bookID, String newStatus) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID)
            temp = temp.next;
        if (temp != null) {
            temp.availabilityStatus = newStatus;
            System.out.println("Availability updated.");
        } else {
            System.out.println("Book not found.");
        }
    }

    // Display forward
    public void displayForward() {
        Book temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    public int countBooks() {
        Book temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Helper method
    public void printBook(Book book) {
        System.out.println("ID: " + book.bookID + ", Title: " + book.title + ", Author: " + book.author +
                ", Genre: " + book.genre + ", Status: " + book.availabilityStatus);
    }
}
