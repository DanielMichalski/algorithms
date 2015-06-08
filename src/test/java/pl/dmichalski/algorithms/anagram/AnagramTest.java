package pl.dmichalski.algorithms.anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void testIsAnagram() throws Exception {
        assertTrue(Anagram.isAnagram("word", "wrdo"));
        assertTrue(Anagram.isAnagram("mary", "army"));
        assertTrue(Anagram.isAnagram("stop", "tops"));
        assertTrue(Anagram.isAnagram("boat", "btoa"));
        assertTrue(Anagram.isAnagram("a", "a"));

        assertFalse(Anagram.isAnagram("pure", "in"));
        assertFalse(Anagram.isAnagram("fill", "fil"));
        assertFalse(Anagram.isAnagram("b", "bbb"));
        assertFalse(Anagram.isAnagram("ccc", "ccccccc"));
        assertFalse(Anagram.isAnagram("sleep", "slep"));
        assertFalse(Anagram.isAnagram(null, "slep"));
        assertFalse(Anagram.isAnagram("sleeep", null));
        assertFalse(Anagram.isAnagram(null, null));
        assertFalse(Anagram.isAnagram("", ""));
        assertFalse(Anagram.isAnagram("blow", ""));
        assertFalse(Anagram.isAnagram("", "hahah"));
    }
}