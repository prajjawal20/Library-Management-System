package lipilink;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample data
        library.addBook(new Book(1, "Java Programming", "James Gosling"));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        library.addUser(new User(1, "Alice"));
        library.addUser(new User(2, "Bob"));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. View Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.viewBooks();
                case 2 -> library.viewUsers();
                case 3 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int bookId = sc.nextInt();
                    library.issueBook(bookId);
                }
                case 4 -> {
                    System.out.print("Enter Book ID to return: ");
                    int bookId = sc.nextInt();
                    library.returnBook(bookId);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
