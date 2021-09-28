package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Random rand = new Random();
    public static void main(String[] args) {
        boolean gaming = true;
        do{
            Scanner input = new Scanner(System.in);

            boolean invalidEntry = true;
            int level = 0;
            while(invalidEntry) {
                System.out.println("Enter the difficulty level: ");
                String userIn = input.nextLine();
                if (userIn.matches(".*[a-z].*")) {
                    System.out.println("Invalid entry. Must enter a number.");
                } else {
                    level = Integer.parseInt(userIn);
                    invalidEntry = false;
                }
            }
            int randomNumber = getRandomNumber(level);
            boolean playing = true;
            int guessCount = 1;
            ArrayList<String> wrongGuesses = new ArrayList<String>();
            wrongGuesses.add("Not a number");
            wrongGuesses.add("Too high");
            wrongGuesses.add("Too low");
            do{
                System.out.println("Guess the number: ");
                String guess = input.nextLine();
                if(guess.matches(".*[a-z].*")){
                    System.out.println(wrongGuesses.get(0));
                }
                else if(guess.equals(Integer.toString(randomNumber))){
                    System.out.println("You win in " + guessCount + " guesses");
                    System.out.println("Play again? y/n:");
                    String playAgain = input.nextLine();
                    if (playAgain.equals("n")){
                        gaming = false;
                        System.out.println("Bye Bye :)");
                    }
                    playing = false;
                }
                else{
                    int guessInt = Integer.parseInt(guess);
                    if(guessInt > randomNumber){
                        System.out.println("Too high");
                        guessCount++;
                    }
                    else{
                        System.out.println("Too low");
                        guessCount++;
                    }
                }
            }while(playing);
        }while(gaming);
    }

    public static int getRandomNumber(int level){
        return rand.nextInt((int) (((Math.pow(10, level) - 1) + 1 ) + 1));
    }
}
