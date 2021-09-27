package ex27;

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
        Assertions.assertEquals("There were no errors found.", AppTest.validateInput("Rachel", "Cameron", "32803", "AA-1234"));
    }
}