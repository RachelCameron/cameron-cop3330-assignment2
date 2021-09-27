package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
        public static void main(String[] args) {
            System.out.println("There are 5 employees:");
            ArrayList <String> list = new ArrayList <String>();
            list.add("John Smith");
            list.add("Jackie Jackson");
            list.add("Chris Jones");
            list.add("Amanda Cullen");
            list.add("Jeremy Goodwin");
            System.out.println(list);
            String removed = selector();
            list = remover(removed, list);

            if(list.size() == 4){
                System.out.println("There are 4 employees:");
                System.out.println(list);
            }
            else{
                System.out.println("Invalid entry.");
            }
        }

        public static String selector() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an employee name to remove:");
            return input.nextLine();
        }

        public static ArrayList remover(String removed, ArrayList list){
            if (list.contains(removed)){
                for(int i=0;i<list.size();i++){
                    if(removed.equals(list.get(i))){
                        list.remove(i);
                    }
                }
                return list;
            }
            else{
                return list;
            }
        }
    }