package com.hughes.exercises;

/*
i/p: vasu34k@gmail.com
o/p: valid emailid
 
i/p: bob34kgmail.com
o/p:Invalid emailid
 */

/**
 * @author bikas
 *
 */

public class ValidEmail {

	public static void main(String[] args) {
		String email = "vasu34@gmail.com";
		String notemail="vasu34gmail.com";
		int index = email.indexOf('@');
		System.out.println(notemail.hashCode());
		int indexdot = email.indexOf('.');
		// if the index of dot is greater than index of @
		if (index >= 0 && indexdot >=0 && indexdot > index) {
			System.out.println("Valid");
		} else {
		
			System.out.println("Not Valid");
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println("5*"+i+"="+(5*i));
		}

	}

}

//String email = "vasu34@gmailcom";
//String notemail="vasu34gmail.com";
//int index = email.indexOf('@');
//int indexdot = email.indexOf('.');
//if (index >= 0 && indexdot >=0 && indexdot > index) {
//	System.out.println("Valid");
//} else {
//
//	System.out.println("Not Valid");
//}
