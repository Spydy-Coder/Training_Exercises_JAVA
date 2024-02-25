package com.hughes.exercises;

/*
 add values from 239 till 699 using for loop.
example:
2 till 8
 
2+3+4+5+6+7+8=?
 */


/**
 * @author bikas
 *
 */

public class AdditionRange {

	public static void main(String[] args) {
		// using for loop to print the numbers in between the given range
		int start=239;
		int end = 699;
		int sum1=0;
		for(int i=start;i<=end;i++) {
			sum1+=i;
		}
		System.out.print(sum1);

	}

}
