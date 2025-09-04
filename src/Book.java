import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }


    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
        System.out.println("Rating " + rating + " added successfully");
    }


    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.size();
    }


    private String roundToOneDecimal(double value) {
        double temp = (int) (value * 10 + 0.05);
        return String.valueOf(temp / 10);
    }


    private String roundToTwoDecimals(double value) {
        double temp = (int) (value * 100 + 0.05);
        return String.valueOf(temp / 100);
    }


    public String getPopularityLevel() {
        double avg = getAverageRating();
        if (ratings.isEmpty()) {
            return "No ratings";
        } else if (avg >= 4.5) {
            return "Excellent";
        } else if (avg >= 3.5) {
            return "Good";
        } else if (avg >= 2.5) {
            return "Average";
        } else if (avg >= 1.5) {
            return "Poor";
        } else {
            return "Terrible";
        }
    }

    // Add multiple ratings using varargs
    public void addMultipleRatings(int... ratings) {
        System.out.print("Ratings added: ");
        for (int i = 0; i < ratings.length; i++) {
            try {
                if (ratings[i] < 1 || ratings[i] > 5) {
                    throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
                }
                this.ratings.add(ratings[i]);
                System.out.print(ratings[i]);
                if (i < ratings.length - 1) {
                    System.out.print(", ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("\nError: " + e.getMessage());
            }
        }
        System.out.println();
    }

    // Get total number of books created
    public static int getTotalBooks() {
        return totalBooks;
    }

    // Get title
    public String getTitle() {
        return title;
    }

    // Get author
    public String getAuthor() {
        return author;
    }

    // Display book details
    public String displayBook() {
        return "Book: " + title + " by " + author + ", Average Rating: "
                + roundToOneDecimal(getAverageRating()) + ", Level: " + getPopularityLevel();
    }

    // Display highest-rated book with 2 decimal precision
    public String displayHighestRated() {
        return getTitle() + " by " + getAuthor() + " (" + roundToTwoDecimals(getAverageRating()) + ")";
    }
}
