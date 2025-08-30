import java.util.*;

public class PostManager {

    // 1. calculateEngagement
    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i : interactions) {
            total += i;
        }
        return total;
    }

    // 2. getCategoryRating
    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500) return "Popular";
        else if (engagementScore >= 100) return "Good";
        else if (engagementScore >= 50) return "Low";
        else return "Poor";
    }

    // 3. Overloaded displayPostStats
    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    // 4. manageHashtags
    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null) return new ArrayList<>();

        ArrayList<String> uniqueHashtags = new ArrayList<>();
        for (String tag : hashtags) {
            if (!uniqueHashtags.contains(tag)) {
                uniqueHashtags.add(tag);
            }
        }
        return uniqueHashtags;
    }

    // 5. findTrendingPosts
    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null) return trending;

        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    // 6. getUniqueAuthors
    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> unique = new HashSet<>();
        if (authors != null) {
            Collections.addAll(unique, authors);
        }
        return unique;
    }
}
