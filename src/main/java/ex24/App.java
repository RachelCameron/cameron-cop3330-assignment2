package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.printf("Enter the first string:");
        String first = input.nextLine();
        System.out.printf("Enter the second string:");
        String second = input.nextLine();

        if (isAnagram(first, second))
        {
            System.out.println("\"" + first + "\" and " + "\"" + second + "\" are anagrams.");
        }
        else
            System.out.println("\"" + first + "\" and " + "\"" + second + "\" are not anagrams.");
        }

    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        else
        {
            char [] firstArray  = first.replaceAll("\\s", "").toLowerCase().toCharArray();
            char [] secondArray = second.replaceAll("\\s", "").toLowerCase().toCharArray();

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            if (Arrays.equals(firstArray, secondArray)) {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}