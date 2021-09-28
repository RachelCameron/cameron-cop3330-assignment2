package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void StringsToArraysTest() {
        Assertions.assertArrayEquals(new int[0],
                App.stringsToArrays(""));

        Assertions.assertArrayEquals(new int[] {6},
                App.stringsToArrays("6"));

        Assertions.assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                App.stringsToArrays( "1 2 3 4 5 6 7 8 9 10"));
    }

    @Test
    public void FilterEvenNumbersTest()  {
        int[] numbers;

        numbers = new int[0];
        Assertions.assertArrayEquals(new int[0],
                        App.filterEvenNumbers(numbers));

        Assertions.assertArrayEquals(new int[0],
                App.filterEvenNumbers(new int[] {1, 3, 5, 7, 9}));

        Assertions.assertArrayEquals(new int[] {2},
                App.filterEvenNumbers(new int[] {2}));

        Assertions.assertArrayEquals(new int[] {},
                App.filterEvenNumbers(new int[] {3}));

        numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(new int[] {2, 4, 6, 8, 10},
                App.filterEvenNumbers(numbers));
    }
}