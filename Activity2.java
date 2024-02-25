package com.hughes.exercises;

/*
 write a java program for beow requirement.
i/p:Hyderabad
o/p:dabaredyH
 */

/**
 * @author bikas
 *
 */

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hyderabad";
		String reversestr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversestr += str.charAt(i);  // loop in reverse
		}
		System.out.println(reversestr);

	}

}
