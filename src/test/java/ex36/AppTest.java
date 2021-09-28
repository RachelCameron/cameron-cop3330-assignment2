package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class AppTest {

    @Test
    public void average() {
        App AppTest = new App();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Assertions.assertEquals(3.0, AppTest.average(numbers));
    }
    @Test
    public void std() {
        App AppTest = new App();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Assertions.assertEquals(1.4142135623730951, AppTest.std(numbers));
    }
    @Test
    public void max() {
        App AppTest = new App();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Assertions.assertEquals(5.0, AppTest.max(numbers));
    }
    @Test
    public void min() {
        App AppTest = new App();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Assertions.assertEquals(1.0, AppTest.min(numbers));
    }
}
