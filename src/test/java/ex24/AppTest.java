package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void isAnagramTrue()
    {
        Assertions.assertTrue(ex24.App.isAnagram("tone", "note"));
        Assertions.assertTrue(ex24.App.isAnagram("rUN", "RUn"));
        Assertions.assertTrue(ex24.App.isAnagram("and or", "nda ro"));
        Assertions.assertTrue(ex24.App.isAnagram("123", "321"));
    }

    @Test
    public void isAnagramFalse()
    {
        Assertions.assertFalse(ex24.App.isAnagram("abc", "xyz"));
        Assertions.assertFalse(ex24.App.isAnagram("1", "2"));
    }
}