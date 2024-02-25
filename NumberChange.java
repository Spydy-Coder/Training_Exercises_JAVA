package com.hughes.exercises;

/*
i/p: 34567
o/p: Thirty four Thousand Five Hunderad and Sixty Seven Only
 
i/p: 345
o/p: Three Hundred and Fourty Five only

*/


/**
 * @author bikas
 *
 */

public class NumberChange {
	// creating arrays for later use
	private String[] unitdigit = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

	private String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	private String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

	public static void main(String[] args) {
		
		int number = 8;
		NumberChange obj = new NumberChange();
		// if the number is zero then just print "Zero"
		if(number ==0) 
			System.out.println("Zero");

		System.out.println(obj.convertNumber(number)+" Only");
	}

// using recursion to get the  number converted to words 
// this will convert the number to word and repeatedly we can get the desired output
	public String convertNumber(int number) {
		if (number < 10) {
			return unitdigit[number];
		} else if (number < 20) {
			return teens[number - 10];
		} else if (number < 100) {
			return tens[number / 10] + " " + convertNumber(number % 10);
		} else if (number < 1000) {
			return unitdigit[number / 100] + " Hundred " + convertNumber(number % 100);
		} else if (number < 100000) {
			return convertNumber(number / 1000) + " Thousand " + convertNumber(number % 1000);
		} else if (number < 10000000) {
			return convertNumber(number / 100000) + " Lakh " + convertNumber(number % 100000);
		} else {
			return "Out of Range";
		}
	}
}
