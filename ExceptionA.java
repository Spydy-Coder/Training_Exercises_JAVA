package com.hughes.exercises;

public class ExceptionA {
	
	public void check(int num) {
		try {
			if(num%2==0) {
				System.out.println("Even Number");
			}
			else {
				throw new ArithmeticException("It is not even");
			}
		}
		catch(ArithmeticException e) {
			System.out.print(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionA e = new ExceptionA();
		e.check(3);

	}

}
