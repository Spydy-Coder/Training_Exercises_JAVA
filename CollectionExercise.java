package com.hughes.exercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/*
 Create a menu driven program to insert,update,delete and find duplicates in Vector
 */

/**
 * @author bikas
 *
 */
public class CollectionExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector obj = new Vector();

		boolean istrue = true;

		while (istrue) {

			System.out.println(
					"Enter your choice (1 to insert, 2 to delete, 3 to display, 4 for duplicates, 5 for Stop): ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter data: ");
				int dat = sc.nextInt();
				obj.add(dat);
				break;
			case 2:
				System.out.println("Enter data to be deleted: ");
				int dataToDelete = sc.nextInt();
				obj.removeElement(dataToDelete);
				break;
			case 3:
				System.out.println("Data in vector: ");
				for (int i = 0; i < obj.size(); i++) {
					System.out.print(obj.get(i) + " ");
				}
				System.out.println();
				break;
			case 4:
				Collections.sort(obj);
				System.out.print("Duplicates are:");
				int i = 0;
				while (i < obj.size()) {
					int ele = (int) obj.get(i);
					for (int j = i + 1; j < obj.size(); j++) {
						if (ele == (int) obj.get(j)) {
							System.out.print(ele + " ");
							break;
						}
					}
					while (i < obj.size() && ((int) obj.get(i) == ele)) {
						i++;

					}
				}
				System.out.println();
				break;
			case 5:
				istrue = false;
				break;
			default:
				System.out.println("Wrong input");
			}     

		}

	}
}
