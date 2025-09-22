// Book.java
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished) {
        setTitle(title);
        setAuthor(author);
        setYearPublished(yearPublished);
        setIsbn(isbn);
        this.isAvailable = true;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public int getYearPublished() { return yearPublished; }

    // Setters with validation
    public void setTitle(String title) {
            this.title = title;
    }

    public void setAuthor(String author) {
           this.author = author;
    }

    public void setYearPublished(int year) {
        if (year < 1450 || year > 2025) {
            System.out.println("Invalid year provided. Year must be between 1450 and 2025");
        } else {
            this.yearPublished = year;
        }
    }

    public void setIsbn(String isbn) {
        if (isbn == null || !(isbn.length() == 10 || isbn.length() == 13)) {
            System.out.println("Invalid ISBN. ISBN must be 10 or 13 characters long");
        } else {
            this.isbn = isbn;
        }
    }


    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Borrow and return methods
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }

    // Display book info
    public void displayBookInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | ISBN: " + isbn +
                " | Year: " + yearPublished + " |");
        System.out.println("Status: " + (isAvailable ? "Available" : "Not Available"));
    }
}
