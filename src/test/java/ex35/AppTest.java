package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppTest {

    @Test
    public void randomizerTest()
    {
       ex35.App AppTest = new App();
       ArrayList<String> test = new ArrayList<>();
       test.add("Yuri");
       test.add("Monika");
       test.add("Natsuki");
       test.add("Sayori");
       Assertions.assertTrue(test.contains(AppTest.randomizer(test)));
    }



}