package pl.dmichalski.algorithms.quicksort;

/**
 * Author: Daniel
 */
public class QuickSort {

    public void sort(int[] values, int left, int right) {
        if (values == null || values.length == 0) return;

        int i = left;
        int j = right;
        int v = values[(left + right) / 2];

        do {
            while (values[i] < v)
                i++;
            while (v < values[j])
                j--;
            if (i <= j) {
                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
                i++;
                j--;
            }
        }
        while (i <= j);
        if (left < j)
            sort(values, left, j);
        if (i < right)
            sort(values, i, right);
    }


}
