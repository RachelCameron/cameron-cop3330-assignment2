package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scanner.nextLine();

        int[] numbers = stringsToArrays(input);
        int[] evenNumbers = filterEvenNumbers(numbers);

        if (evenNumbers.length != 0) {
            System.out.print("The even numbers are ");
            for (int i = 0; i < evenNumbers.length; i++) {
                System.out.print(evenNumbers[i]);

                if (i < evenNumbers.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(".");
        }
        else  {
            System.out.println("There are no even numbers.");
        }
    }

    public static int[] stringsToArrays(String input)  {
        if (input.isEmpty())  {
            return new int[0];
        }

        String[] data = input.split(" ");

        int[] numbers = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            numbers[i] = Integer.parseInt(data[i]);
        }

        return numbers;
    }

    public static int[] filterEvenNumbers(int[] array)  {
        int[] evenNumbers = new int[array.length];

        int k = 0;
        for (int n: array)  {
            if (n % 2 == 0)  {
                evenNumbers[k++] = n;
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = evenNumbers[i];
        }

        return result;
    }
}