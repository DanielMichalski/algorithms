package pl.dmichalski.algorithms.anagram;

/**
 * Author: Daniel
 */
public class Anagram {

    /**
     * Metoda sprawdzająca czy dwa podane teskty tworzą anagram.
     * @param text1 pierwszy teskt
     * @param text2 drugi tekst
     * @return zwraca true kiedy tworza anagram, false kiedy nie tworza anagramu
     */
    public static boolean isAnagram(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0) {
            return false;
        }
        if (text1.length() != text2.length()) {
            return false;
        }

        char[] chars = text1.toCharArray();

        for (char c : chars) {
            int index = text2.indexOf(c);
            if (index != -1) {
                text2 = text2.substring(0, index) + text2.substring(index + 1, text2.length());
            } else {
                return false;
            }
        }

        return text2.isEmpty();
    }

}
