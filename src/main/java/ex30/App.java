package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

public class App {
    public static void main(String[] args) {
        multiplicationTable(); }

    public static String multiplicationTable() {
     for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
             System.out.printf("%4d", (i * j)); }
             System.out.print("\n");
        }
     return "Printed successfully.";
    }
}