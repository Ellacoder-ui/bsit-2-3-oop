import java.util.ArrayList;

class Book {
    // Variables
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }

    // Add a single rating
    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
    }

    // Get average rating
    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return sum / ratings.size();
    }

    // Get popularity level
    public String getPopularityLevel() {
        if (ratings.isEmpty()) {
            return "No ratings";
        }
        double avg = getAverageRating();
        if (avg >= 4.5) return "Excellent";
        else if (avg >= 3.5) return "Good";
        else if (avg >= 2.5) return "Average";
        else if (avg >= 1.5) return "Poor";
        else return "Terrible";
    }

    // Add multiple ratings (varargs)
    public void addMultipleRatings(int... ratings) {
        for (int r : ratings) {
            try {
                addRating(r);
            } catch (IllegalArgumentException e) {
                System.out.println("Error adding rating " + r + ": " + e.getMessage());
            }
        }
    }

    // Get total books created
    public static int getTotalBooks() {
        return totalBooks;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display book details
    public String displayBook() {
        return "Book: " + title + " by " + author +
                ", Average Rating: " + String.format("%.2f", getAverageRating()) +
                ", Level: " + getPopularityLevel();
    }
}

