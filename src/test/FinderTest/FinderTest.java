import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {

    private Finder _finder = new Finder();

    // Test max
    @Test
    public void findMax_ValidArray() {
        int[] testArray = {1, 2, 3, 4, 5, 6};
        Integer expected = 6;
        Integer actual = _finder.findMax(testArray);

        assertEquals(expected, actual);
    }

    // Test min
    @Test
    public void findMin_ValidArray() {
        int[] testArray = {1, 2, 3, 4, 5, 6};
        Integer excepted = 1;
        Integer actual = _finder.findMin(testArray);

        assertEquals(excepted, actual);
    }

    // Test empty
    @Test
    public void findMax_EmptyArray() {
        int[] emptyArray = new int[50];
        Integer expected = 0;
        Integer actual = _finder.findMax(emptyArray);
        assertEquals(expected, actual);
    }

    @Test
    public void findMin_EmptyArray() {
        int[] emptyArray = new int[50];
        Integer expected = 0;
        Integer actual = _finder.findMin(emptyArray);
        assertEquals(expected, actual);
    }

    // Test null
    @Test
    public void findMax_NullArray() {
        Integer actual = _finder.findMax(null);
        assertEquals(null, actual);
    }


    @Test
    public void findMin_NullArray() {
        Integer actual = _finder.findMin(null);
        assertEquals(null, actual);
    }

}