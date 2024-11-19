import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SalesItemTest {

    @Test
    public void testAddCommentAndCount() {
        SalesItem salesItem = new SalesItem("Java Book", 12345);
        
        assertTrue(salesItem.addComment("James Duckling", "Great book...", 4));
        assertTrue(salesItem.addComment("Fred", "Like it", 2));
        
        assertEquals(2, salesItem.getNumberOfComments());
    }

    @Test
    public void testRejectDuplicateAuthorComment() {
        SalesItem salesItem = new SalesItem("Java Book", 12345);
        
        assertTrue(salesItem.addComment("James Duckling", "Great book...", 4));
        
        assertEquals(false, salesItem.addComment("James Duckling", "Not as good on second read.", 3));
    }

    @Test
    public void testRejectInvalidRating() {
        SalesItem salesItem = new SalesItem("Java Book", 12345);
        
        assertEquals(false, salesItem.addComment("Jane Doe", "Not my style", 0));
        
        assertEquals(false, salesItem.addComment("John Doe", "Amazing read!", 6));
    }
}