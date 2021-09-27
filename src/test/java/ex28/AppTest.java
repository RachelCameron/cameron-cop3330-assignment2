package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void validateInput() {
        App AppTest = new App();
        int[] nums = {1, 2, 3, 4, 5};
        Assertions.assertEquals(15, AppTest.getSum(nums));
    }
}