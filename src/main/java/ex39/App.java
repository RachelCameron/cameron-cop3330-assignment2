package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Map<String, String>> employees = readEmployeesFromFile();
        sortEmployees(employees);
        printTable(employees);
    }

    private static List<Map<String, String>> readEmployeesFromFile() {
        List<Map<String, String>> result = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("employees.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");

                Map<String, String> employee = new HashMap<>();
                employee.put("first name", data[0]);
                employee.put("last name", data[1]);
                employee.put("position", data[2]);
                employee.put("separation date", data[3]);

                result.add(employee);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find employees.txt file!");
        }

        return result;
    }

    public static void sortEmployees(List<Map<String, String>> employees) {

    }

    public static void printTable(List<Map<String, String>> employees) {
        System.out.format("%-15s| %-15s| %-15s%n", "Name", "Position",
                "Separation Date");
        System.out.println("---------------------------------------------");
        for (Map<String, String> e : employees) {
            System.out.format("%-15s| %-15s| %-15s%n", e.get("first name"),
                    e.get("last name"), e.get("separation date"));
        }
    }
}