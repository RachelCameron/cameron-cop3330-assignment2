package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void passwordValidatorTrue()
    {
        Assertions.assertTrue(ex25.App.passwordValidator("TEST", "TEST"));
    }

    @Test
    public void passwordValidatorFalse()
    {
        Assertions.assertFalse(ex25.App.passwordValidator("TEST", "TEST"));
    }
}