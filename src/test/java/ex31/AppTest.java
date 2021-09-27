package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void mathCheckerTrue() {
        App AppTest = new App();
        Assertions.assertEquals(138, Math.round(AppTest.mathChecker(22, 65, 55)));
        Assertions.assertEquals(145, Math.round(AppTest.mathChecker(22, 65, 60)));
        Assertions.assertEquals(151, Math.round(AppTest.mathChecker(22, 65, 65)));
    }
}