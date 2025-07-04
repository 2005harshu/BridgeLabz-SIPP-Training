package llibraryManagement;

public class Main {
	public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Ramayana", "Valmiki", "Epic", 101, "Available", 1);
        lib.addBook("Mahabharata", "Vyasa", "Mythology", 102, "Issued", 2);
        lib.addBook("Wings of Fire", "APJ Abdul Kalam", "Autobiography", 103, "Available", 2);

        System.out.println("\nAll books (forward):");
        lib.displayForward();

        System.out.println("\nAll books (reverse):");
        lib.displayReverse();

        System.out.println("\nSearch for 'Vyasa':");
        lib.searchBook("Vyasa");

        System.out.println("\nUpdating availability of Book ID 103:");
        lib.updateAvailability(103, "Issued");

        System.out.println("\nRemoving Book ID 102:");
        lib.removeBook(102);

        System.out.println("\nAll books after removal:");
        lib.displayForward();

        System.out.println("\nTotal books in library: " + lib.countBooks());
    }
}
