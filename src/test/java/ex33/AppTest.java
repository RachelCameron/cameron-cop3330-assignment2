package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void resultYes()
    {
       App AppTest = new App();
       Assertions.assertEquals("Yes.", ex33.App.result(0));
    }

    @Test
    public void resultNo()
    {
        App AppTest = new App();
        Assertions.assertEquals("No.", ex33.App.result(1));
    }

    @Test
    public void resultMaybe()
    {
        App AppTest = new App();
        Assertions.assertEquals("Maybe.", ex33.App.result(2));
    }

    @Test
    public void resultAskAgainLater()
    {
        App AppTest = new App();
        Assertions.assertEquals("Ask again later.", ex33.App.result(3));
    }

}