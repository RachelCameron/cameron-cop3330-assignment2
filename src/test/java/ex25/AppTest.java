package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void passwordValidator() {
        App AppTest = new App();
        Assertions.assertEquals(1, AppTest.passwordValidator("12345"));
        Assertions.assertEquals(2, AppTest.passwordValidator("abcdef"));
        Assertions.assertEquals(3, AppTest.passwordValidator("abc123xyz"));
        Assertions.assertEquals(4, AppTest.passwordValidator("1337h@xor!"));
        Assertions.assertEquals(0, AppTest.passwordValidator("h1"));
    }
}