package com.hughes.exercises;

/*
 Based on the i/p,you need to display whether it is integer or float or character or string.
 */


/**
 * @author bikas
 *
 */

import java.util.Scanner;

public class DisplayType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String input = scanner.nextLine();

        identifyInputType(input);
    }

    private static void identifyInputType(String input) {
        try {
            // checking integer
            int intValue = Integer.parseInt(input);
            System.out.println("Input is an Integer");
        } catch (Exception e1) {
            try {
                // checking float
                float floatValue = Float.parseFloat(input);
                System.out.println("Input is a Float");
            } catch (Exception e2) {
                if (input.length() == 1) {
                    // checking character
                    System.out.println("Input is a Character");
                } else {
                    // if none of the above then it is string
                    System.out.println("Input is a String");
                }
            }
        }
    }
}

