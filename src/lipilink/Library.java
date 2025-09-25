package lipilink;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
