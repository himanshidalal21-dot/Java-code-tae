import java.util.ArrayList;

// Book class
class Book {
    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

// Library class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add book
    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.title);
    }

    // Remove book by ISBN
    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed: " + b.title);
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book b : books) {
            b.display();
        }
    }
}

// Main class
public class Que2 {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("Data Structures", "Mark Allen", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("\nAll Books:");
        lib.displayBooks();

        System.out.println("\nRemoving book with ISBN 101:");
        lib.removeBook("101");

        System.out.println("\nUpdated Book List:");
        lib.displayBooks();
    }
}