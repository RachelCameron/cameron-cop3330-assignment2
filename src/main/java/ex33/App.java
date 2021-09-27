package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's  your question?\n> ");
        String question = input.nextLine();
        Random random = new Random();
        int randomizer = random.nextInt(4);
        System.out.println(result(randomizer));
    }

    public static String result(int answer) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("Yes.");
        list.add("No.");
        list.add("Maybe.");
        list.add("Ask again later.");
        return list.get(answer);
    }
}