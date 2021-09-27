package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = new int[5];
        nums = getNums(nums);
        int sum = getSum(nums);
        System.out.println("The total is " + sum);
    }
    public static int[] getNums(int[] nums){
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            nums[i] = input.nextInt();
        }
        return nums;
    }
    public static int getSum(int[] nums){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum = sum + nums[i];
        }
        return sum;
    }

}