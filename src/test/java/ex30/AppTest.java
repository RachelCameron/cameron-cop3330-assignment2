package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void multiplicationTableTrue() {
        App AppTest = new App();
        Assertions.assertEquals("Printed successfully.", AppTest.multiplicationTable());
    }
}