import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager manager = new PostManager();

        System.out.println("═══ Social Media Post Manager ═══");

        String postTitle = "Java Programming Tips";
        int engagement = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagement);

        // Display using overloaded methods
        manager.displayPostStats(postTitle, engagement, category);
        System.out.println();

        // Hashtags
        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        // Trending Posts
        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Java Programming Tips", "Advanced Java Tutorial", "Spring Boot Guide"));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagement);
        postEngagement.put("Advanced Java Tutorial", 800);
        postEngagement.put("Spring Boot Guide", 600);

        LinkedList<String> trending = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trending);

        // Authors
        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
