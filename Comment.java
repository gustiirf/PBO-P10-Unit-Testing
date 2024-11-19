public class Comment {
    private String author;
    private String text;
    private int rating;
    private int votes;

    public Comment(String author, String text, int rating) {
        this.author = author;
        this.text = text;
        this.rating = rating;
        this.votes = 0; 
    }

    public String getAuthor() {
        return author;
    }

    public String getFullDetails() {
        return "Author: " + author + "\n" +
                "Rating: " + rating + "\n" +
                "Votes: " + votes + "\n" +
                "Comment: " + text;
    }

    public int getVoteCount() {
        return votes;
    }

    public void upvote() {
        votes++;
    }


    public void downvote() {
        votes--;
    }
}