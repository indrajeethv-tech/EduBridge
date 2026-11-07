class LibraryBookCounter {
    String title;
    String author;
    double price;

    // Static variable
    static int bookCount = 0;

    // Constructor
    LibraryBookCounter(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    // Static method
    static void displayBookCount() {
        System.out.println("Total Books in Library: " + bookCount);
    }

    // Method to display book details
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Creating book objects
        LibraryBookCounter b1 =
            new LibraryBookCounter("Java Programming", "James Gosling", 450);

        LibraryBookCounter b2 =
            new LibraryBookCounter("Python Basics", "John Smith", 350);

        LibraryBookCounter b3 =
            new LibraryBookCounter("Data Structures", "Mark Allen", 500);

        // Display book details
        b1.display();
        b2.display();
        b3.display();

        // Calling static method
        LibraryBookCounter.displayBookCount();
    }
}