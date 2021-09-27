package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String first = input.nextLine();
        System.out.println("Enter the last name:");
        String last = input.nextLine();
        System.out.println("Enter the ZIP code:");
        String zip = input.nextLine();
        System.out.println("Enter the employee ID:");
        String id = input.nextLine();
        String result = validateInput(first, last, zip, id);
        System.out.println(result);
    }
    public static String validateInput(String first, String last, String zip, String id){
        String firstStatus = validateFirst(first);
        String lastStatus = validateLast(last);
        String zipStatus = validateZip(zip);
        String idStatus = validateID(id);
        String status = firstStatus + lastStatus + zipStatus + idStatus;
        if(status.equals("")){
            status = "There were no errors found.";
        }
        return status ;
    }
    public static String validateFirst(String first){
        String status = "";
        if(first.equals("")){
            status = status + "The first name can't be nothing.\n";
        }
        if(first.length() < 2){
            status = status + "The first name must be at least 2 characters long.\n";
        }
        return status;
    }
    public static String validateLast(String last){
        String status = "";
        if(last.equals("")){
            status = status + "The first name can't be nothing.\n";
        }
        if(last.length() < 2){
            status = status + "The first name must be at least 2 characters long.\n";
        }
        return status;
    }
    public static String validateZip(String zip){
        String status = "";
        if(zip.matches(".*[a-z].*") || zip.length() != 5){
            status = status + "The zipcode must be a 5 digit number.\n";
        }
        return status;
    }
    public static String validateID(String id){
        String status = "";
         if(id.length() != 7 || !(id.substring(0, 2).matches("[a-zA-Z]+") && id.charAt(2) == '-' && id.substring(3, 7).matches("[0-9]+"))){
            status = status + "The employee ID must be in the format of AA-1234.\n";
         }
         return status;
    }
}