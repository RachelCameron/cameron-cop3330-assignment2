package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the password?");
        String password = input.nextLine();

        int strength;
        strength = passwordValidator(password);
        String output;

        if(strength == 1){
            output = "The password '" + password + "' is a very weak password.";
        }
        else if(strength == 2){
            output = "The password '" + password + "' is a weak password.";
        }
        else if(strength == 3){
            output = "The password '" + password + "' is a strong password.";
        }
        else if(strength == 4){
            output = "The password '" + password + "' is a very strong password.";
        }
        else{
            output = "The password '" + password + "' is of an unknown strength.";
        }
        System.out.println(output);
    }
    public static int passwordValidator(String password){
        boolean hasNum = false;
        boolean hasLetter = false;
        boolean hasSpec = false;

        int strength;
        int strongLength = 8;

        char[] array = password.toCharArray();
        for (char c : array){
            if(Character.isDigit(c)){
                hasNum = true;
            }
            else if(Character.isAlphabetic(c)){
                hasLetter = true;
            }
            else {
                hasSpec = true;
            }
        }
        if (array.length < strongLength && hasNum && !hasLetter){
            strength = 1;
        }
        else if(array.length < strongLength && hasLetter && !hasNum){
            strength = 2;
        }
        else if(array.length >= strongLength && hasLetter && hasNum &&!hasSpec){
            strength = 3;
        }
        else if(array.length >= strongLength && hasLetter && hasNum && hasSpec){
            strength = 4;
        }
        else{
            strength = 0;
        }
            return strength;
    }
}

