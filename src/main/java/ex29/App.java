package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int years;
        int rate;
        boolean validEntry = false;
        System.out.println("What is the rate of return?");
        String entry = input.nextLine();
        do{
            if(entry.matches(".*[a-z].*")){
                System.out.println("Error: Invalid Input");
                System.out.println("What is the rate of return?");
                entry = input.nextLine();
            }
            else {
                rate = Integer.parseInt(entry);
                if(rate == 0){
                    System.out.println("Error: Invalid Input");
                    System.out.println("What is the rate of return?");
                    entry = input.nextLine();
                }
                else{
                    years = getYears(rate);
                    System.out.println("It will take " + years + " years to double your investment.");
                    validEntry = true;
                }
            }
        }while(!validEntry);
    }
    public static int getYears(int rate){
        return 72/rate;
    }
}