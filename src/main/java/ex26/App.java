package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your balance:");
            float bal = input.nextFloat();
            System.out.println("Enter the APR (as a percent):");
            int apr = input.nextInt();
            System.out.println("Enter your monthly payment:");
            float pay = input.nextFloat();
            PaymentCalculator paymentCalculator = new PaymentCalculator(bal, apr, pay);
            double months = paymentCalculator.calculateMonthsUntilPaidOff();
            months = Math.ceil(months);
            int month = (int) months;
            System.out.println("It will take you " + month + " months to pay off the card.");
    }
}