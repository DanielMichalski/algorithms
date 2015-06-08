package pl.dmichalski.algorithms.bubble_sort;

import java.util.Random;

/**
 * Author: Daniel
 */
public class BubbleSortTester {

    public static void main(String[] args) {
        Random generator = new Random();
        BubbleSort bubble = new BubbleSort();

        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = generator.nextInt(11);
        }

        System.out.println("Oryginalna tablica: ");
        printArray(values);

        int[] sortedValues  = bubble.sortArray(values);

        System.out.println("\nPo sortowaniu: ");
        printArray(sortedValues);
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }
}

