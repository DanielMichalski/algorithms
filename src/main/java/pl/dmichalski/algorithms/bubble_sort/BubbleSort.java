package pl.dmichalski.algorithms.bubble_sort;

import java.util.Arrays;

/**
 * Author: Daniel
 */
public class BubbleSort {

    public int[] sortArray(int[] numbers) {
        if (numbers == null) return null;
        int[] array = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
