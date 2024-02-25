package com.hughes.exercises;

/*
"aksajd5676@$%^"

No of Numbers:
No of Alpabets:
Total Size:
	
*/

/**
 * @author bikas
 *
 */
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expr = "aksajd5676@$%^";
		int alpha = 0;
		int num = 0;
		for (int i = 0; i < expr.length(); i++) {
			char ch = expr.charAt(i);
			if (ch >= '0' && ch <= '9') {  // checking their ascii value  
				num++;
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				alpha++;
			}

		}
		System.out.println("No of Alpabets:" + alpha);
		System.out.println("No of Numbers:" + num);
		System.out.println("Total Size:" + expr.length());

	}

}
