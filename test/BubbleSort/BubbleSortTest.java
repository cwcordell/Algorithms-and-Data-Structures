package BubbleSort;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by corycordell on 1/29/17.
 */
public class BubbleSortTest {

    @Test
    public void sort() throws Exception {
        int[] ar = {5,3,6,1,4,2};
        BubbleSort.sort(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }

    @Test
    public void sortSorted() throws Exception {
        int[] ar = {1,2,3,4,5,6};
        BubbleSort.sort(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }

    @Test
    public void sortReverseSorted() throws Exception {
        int[] ar = {6,5,4,3,2,1};
        BubbleSort.sort(ar);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }

    @Test
    public void sortPositiveAndNegativeInts() throws Exception {
        int[] ar = {-43,-1,-56,32,-97,0,434,-31,-99,4};
        BubbleSort.sort(ar);
        assertArrayEquals(new int[]{-99,-97,-56,-43,-31,-1,0,4,32,434}, ar);
    }
}