package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        App app = new App();
        int age = app.validateAge();
        int rate = app.validateRate();

        System.out.printf("Resting Pulse: %d        Age: %d\n", rate, age);
        System.out.println("\nIntensity    | Rate");
        System.out.println("-------------|--------");
        for(int intensity = 55; intensity <= 95; intensity += 5)
        {
            System.out.printf("%d%%          | %3.0f bpm\n", intensity, (((220.0-age)-rate)*(intensity/100.0))+rate);
        }

    }
    public int validateAge() {
        int age = 0;
            System.out.print("What's your age?\n");
            if (input.hasNextInt()) {
                age = input.nextInt();
            } else {
                System.out.print("Invalid entry.");
                input.next();
            }
        return age;
    }

    public int validateRate() {
        int rate = 0;
        System.out.print("What's your resting heart rate?\n");
        if (input.hasNextInt()) {
            rate = input.nextInt();
        } else {
            System.out.print("Invalid entry.");
            input.next();
        }
        return rate;
    }
}
