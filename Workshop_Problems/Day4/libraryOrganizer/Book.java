package libraryOrganizer;

import java.util.*;

public class Book {
    private static HashMap<String, LinkedList<String>> h = new HashMap<>();
    private static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Library");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (n) {
                case 1:
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();

                    if (!set.contains(book)) {
                        h.putIfAbsent(genre, new LinkedList<>());
                        h.get(genre).add(book);
                        set.add(book);
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Book already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter genre: ");
                    String rg = sc.nextLine();
                    System.out.print("Enter book name to remove: ");
                    String rb = sc.nextLine();

                    if (h.containsKey(rg) && h.get(rg).remove(rb)) {
                        set.remove(rb);
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    for (Map.Entry<String, LinkedList<String>> e : h.entrySet()) {
                        System.out.println(e.getKey() + ": " + e.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Incorrect choice.");
                    break;
            }

        } while (n != 4);

        sc.close();
    }
}
