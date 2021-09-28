package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers;
        numbers = new ArrayList<>();
        String userEntry;
        do{
            System.out.println("Enter an integer, or type done if you've finished entering integers: ");
            userEntry = input.nextLine();
            if(!userEntry.equals("done")){
                try{
                    int num = Integer.parseInt(userEntry);
                    numbers.add(num);
                }
                catch(NumberFormatException ignored){
                }

            }
        }
        while(!(userEntry.equals("done")));
        double average = average(numbers);
        double maximum = max(numbers);
        double minimum = min(numbers);
        double standardDeviation = std(numbers);
        System.out.println("\nNumbers: " + numbers +
                "\nThe average is: " + average +
                "\nThe minimum is: " + minimum +
                "\nThe maximum is: " + maximum +
                "\nThe standard deviation is: " + standardDeviation);

    }
    public static double average(ArrayList<Integer> numbers){
        double sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        return sum/numbers.size();
    }
    public static double std(ArrayList<Integer> numbers){
        double sum = 0;
        double average = average(numbers);
        for (int num : numbers){
            sum = sum + Math.pow((num-average), 2);
        }
        return Math.sqrt(sum/numbers.size());
    }
    public static int max(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int min(ArrayList<Integer> numbers){
        int min = numbers.get(0);
        for(int num : numbers){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}