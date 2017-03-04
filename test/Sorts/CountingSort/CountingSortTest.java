/**
 * Created by corycordell on 2/11/17.
 */
package Sorts.CountingSort;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountingSortTest {
    @Test
    public void sort() throws Exception {
        int[] ar = {5,3,6,1,4,2};
        assertArrayEquals(new int[]{1,2,3,4,5,6}, CountingSort.sort(ar, new int[ar.length], 6));
    }

    @Test
    public void sortZero() throws Exception {
        int[] ar = {5,3,0,1,4,2};
        assertArrayEquals(new int[]{0,1,2,3,4,5,}, CountingSort.sort(ar, new int[ar.length], 6));
    }

    @Test
    public void sortSingleValue() throws Exception {
        int[] ar = {22};
        assertArrayEquals(new int[]{22}, CountingSort.sort(ar, new int[ar.length], 22));
    }

    @Test
    public void sortNoValue() throws Exception {
        int[] ar = {};
        assertArrayEquals(new int[]{}, CountingSort.sort(ar, new int[ar.length], 0));
    }
}
