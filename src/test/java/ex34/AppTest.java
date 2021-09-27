package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppTest {

    @Test
    public void remover() {
        App AppTest = new App();
        ArrayList <String> list = new ArrayList<>();
        list.add("Natsuki");
        list.add("Sayori");
        list.add("Yuri");
        list.add("Monika");
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Natsuki");
        list2.add("Yuri");
        list2.add("Monika");
        Assertions.assertEquals(list2, AppTest.remover("Sayori", list));
    }
}