package pl.dmichalski.algorithms.quicksort;

import org.junit.Test;
import pl.dmichalski.algorithms.bubble_sort.BubbleSort;

import static org.junit.Assert.*;

/**
 * Author: Daniel
 */
public class QuickSortTest {

    @Test
    public void testQuicksort() throws Exception {
        QuickSort quickSort = new QuickSort();

        int[] values1 = {4, 2, 8};
        quickSort.sort(values1, 0, values1.length -1);
        assertArrayEquals(new int[]{2, 4, 8}, values1);

        int[] values2 = {6, 4, 5, 0, 6, 3};
        quickSort.sort(values2, 0, values2.length -1);
        assertArrayEquals(new int[]{0, 3, 4, 5, 6, 6}, values2);

        int[] values3 = {};
        quickSort.sort(values3, 0, values3.length -1);
        assertArrayEquals(new int[]{}, values3);

        int[] values4 = {5};
        quickSort.sort(values4, 0, values4.length -1);
        assertArrayEquals(new int[]{5}, values4);
    }
}