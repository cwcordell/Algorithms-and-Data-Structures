/**
 * Created by corycordell on 2/11/17.
 */
package QuickSort;

import org.junit.Test;
import static org.junit.Assert.*;


public class QuickSortTest {

    @Test
    public void sort() throws Exception {
        int[] ar = {5,3,6,1,4,2};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }

    @Test
    public void sortSameEnds() throws Exception {
        int[] ar = {0,3,5,1,4,2,0};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{0,0,1,2,3,4,5}, ar);
    }

    @Test
    public void sortSorted() throws Exception {
        int[] ar = {1,2,3,4,5,6};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }

    @Test
    public void sortReverseSorted() throws Exception {
        int[] ar = {6,5,4,3,2,1};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, ar);
    }

    @Test
    public void sortNonConsecutive() throws Exception {
        int[] ar = {43,1,56,32,97,434,31,99,4};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{1, 4, 31, 32, 43, 56, 97, 99, 434}, ar);
    }

    @Test
    public void sortNegativeInts() throws Exception {
        int[] ar = {-43,-1,-56,-32,-97,-434,-31,-99,-4};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{-434,-99,-97,-56,-43,-32,-31,-4,-1}, ar);
    }

    @Test
    public void sortPositiveAndNegativeInts() throws Exception {
        int[] ar = {-43,-1,-56,32,-97,0,434,-31,-99,4};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{-99,-97,-56,-43,-31,-1,0,4,32,434}, ar);
    }

    @Test
    public void sortSingleValue() throws Exception {
        int[] ar = {22};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{22}, ar);
    }

    @Test
    public void sortNoValue() throws Exception {
        int[] ar = {};
        QuickSort.sort(ar, 0, ar.length - 1);
        assertArrayEquals(new int[]{}, ar);
    }
}