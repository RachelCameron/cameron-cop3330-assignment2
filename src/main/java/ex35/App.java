package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String name;
        boolean empty = false;

        while(!empty){
            System.out.println("Enter a name: ");
            name = input.nextLine();
            if(name.equals("")){
                empty = true;
            }
            else{
                names.add(name);
            }
        }

        System.out.println("The winner is " + randomizer(names) + "!");

    }
    public static String randomizer(ArrayList<String> entries){
        Random random = new Random();
        int winningIndex = random.nextInt(entries.size());
        return entries.get(winningIndex);
    }
}