package pl.dmichalski.algorithms.palindrom;

import org.junit.Assert;
import org.junit.Test;

public class PalindromTest {

    @Test
    public void testIsPalindrom() throws Exception {
        Palindrom palindrom = new Palindrom();

        Assert.assertTrue(palindrom.isPalindrom("kajak"));
        Assert.assertTrue(palindrom.isPalindrom("oko"));
        Assert.assertTrue(palindrom.isPalindrom("oooo"));
        Assert.assertTrue(palindrom.isPalindrom("pep"));
        Assert.assertTrue(palindrom.isPalindrom("LllllllllL"));

        Assert.assertFalse(palindrom.isPalindrom("ja"));
        Assert.assertFalse(palindrom.isPalindrom("kakdfd"));
        Assert.assertFalse(palindrom.isPalindrom("LasdsfsL"));
        Assert.assertFalse(palindrom.isPalindrom("MoJa"));
        Assert.assertFalse(palindrom.isPalindrom("JaceKe"));


    }
}