package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    @Test
    public void isAnagramTest() {
        assertTrue(App.isAnagram("tone", "note"));
        assertTrue(App.isAnagram("run", "nur"));
        assertTrue(App.isAnagram("ramble", "marble"));
    }
}