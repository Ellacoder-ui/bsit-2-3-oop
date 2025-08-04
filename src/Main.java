public class Main {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("Shatter Me", "Tahereh Mafi", 328);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        // Display book info
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        // Borrow and return operations
        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}