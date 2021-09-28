package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the minimum length?");
        String min = input.nextLine();
        System.out.println("How many special characters?");
        String spec = input.nextLine();
        System.out.println("How many numbers?");
        String num = input.nextLine();
    }
}