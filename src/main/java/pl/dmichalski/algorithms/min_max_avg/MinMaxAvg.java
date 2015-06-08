package pl.dmichalski.algorithms.min_max_avg;

/**
 * Klasa obliczająca Min,Max,Avg.
 * Author: Daniel
 */
public class MinMaxAvg {

    /**
     * Metoda oblicza minimum z podanej tablicy.
     *
     * @param values tablica wartości
     * @return zwraca Min z tablicy
     */
    public int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }

        return min;
    }

    /**
     * Metoda oblicza maximum z podanej tablicy.
     *
     * @param values tablica wartości
     * @return zwraca Max z tablicy
     */
    public int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    /**
     * Metoda oblicza avg z podanej tablicy.
     *
     * @param values tablica wartości
     * @return zwraca Avg z tablicy
     */
    public double avg(int[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}

// values[0] = 1;
// values[1] = 2;
// values[2] = 3;