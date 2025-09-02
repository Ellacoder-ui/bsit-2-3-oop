import java.util.ArrayList;
import java.util.Scanner;

class LibraryManager {
    ArrayList<String> books;
    Scanner scanner;

    // Constructor
    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }

    // Show Books
    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized.");
            }
            if (books.isEmpty()) {
                System.out.println("Library is empty.");
            } else {
                System.out.println("Books in the library:");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(i + " - " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Show books operation completed.");
        }
    }

    // Add Book
    public void addBook() {
        try {
            System.out.print("Enter book title to add: ");
            String inputTitle = scanner.nextLine();

            if (inputTitle == null || inputTitle.equals("")) {
                throw new IllegalArgumentException("Book title cannot be empty or null.");
            }
            if (inputTitle.length() < 3) {
                throw new IllegalArgumentException("Book title must have at least 3 characters.");
            }
            books.add(inputTitle);
            System.out.println("Book added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
            showBooks();
        }
    }

    // Remove Book
    public void removeBook() {
        try {
            if (books.isEmpty()) {
                System.out.println("Cannot remove. Library is empty.");
                return;
            }

            System.out.print("Enter index of book to remove: ");
            String input = scanner.nextLine();
            int index = Integer.parseInt(input);

            if (index < 0) {
                throw new IllegalArgumentException("Index cannot be negative.");
            }
            books.remove(index);
            System.out.println("Book removed successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
            showBooks();
        }
    }
}
