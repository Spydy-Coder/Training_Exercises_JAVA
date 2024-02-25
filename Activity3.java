package com.hughes.exercises;

/*
 i/p: a b c d e f
o/p: f1 e2 d3 c4 b5 a6
 */


/**
 * @author bikas
 *
 */

public class Activity3 {

	public static void main(String[] args) {
		String input="a b c d e f";
		int count=1;
		
		// using that we loop in reverse to print the desired output
		String output="";
		for(int i=input.length()-1;i>=0;i--){
			char ch=input.charAt(i);
			if(ch>='a' && ch<='z') {
				output+=String.valueOf(ch)+count+" ";
				count++;
			}
		}
		System.out.println(output);
				
		

	}

}
