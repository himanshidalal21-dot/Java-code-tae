class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
}

// Main class
public class Que19 {
    public static void main(String[] args) {

        // Array of Book objects
        Book[] books = new Book[3];
        books[0] = new Book("Java Programming", "Himanshi Dalal", 500);
        books[1] = new Book("Data Structures", "Rahul Sharma", 650);
        books[2] = new Book("Algorithms", "Ananya Singh", 700);

        // Display all books
        for (Book b : books) {
            b.display();
        }
    }
}