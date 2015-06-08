package pl.dmichalski.algorithms.bubble_sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void testSortArray() throws Exception {
        BubbleSort bub = new BubbleSort();

        int[] values1 = {4, 2, 8};
        assertArrayEquals(new int[]{2, 4, 8}, bub.sortArray(values1));

        int[] values2 = {6, 4, 5, 0, 6, 3};
        assertArrayEquals(new int[]{0, 3, 4, 5, 6, 6}, bub.sortArray(values2));

        int[] values3 = {};
        assertArrayEquals(new int[]{}, bub.sortArray(values3));

        int[] values4 = {5};
        assertArrayEquals(new int[]{5}, bub.sortArray(values4));


        assertNull(bub.sortArray(null));

    }

}