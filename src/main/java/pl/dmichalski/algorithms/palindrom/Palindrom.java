package pl.dmichalski.algorithms.palindrom;


/**
 * Klasa zawiera metodę testującą palindromy.
 * Author: Daniel
 */
public class Palindrom {

    /**
     * Metoda sprawdza czy podany teskt jest palindromem.
     *
     * @param text tekst do sprawdzenia.
     * @return true jeśli jest palindromem,false w przeciwnym wypadku.
     */
    public boolean isPalindrom(String text) {

        StringBuilder sBuilder = new StringBuilder(text);
        String textReversed = sBuilder.reverse().toString();

        return text.equals(textReversed);

    }

}
