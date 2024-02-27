package com.hughes.customException;

import com.hughes.customException.CharacterException;
import java.util.*;

/**
 * @author bikas
 *
 */

public class CustomException1 {

	public boolean checkNumber(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}

	public void check(String input) {

		try {
			boolean isNumber = checkNumber(input);
			if (isNumber) {
				throw new NumberFormatException("It is a number");
			} else if (input.length() == 1) {
				throw new CharacterException("Charcter Found");
			} else {
				System.out.println("Valid String");
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (CharacterException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		CustomException1 obj = new CustomException1();
		obj.check(input);
	}

}
