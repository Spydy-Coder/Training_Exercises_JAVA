package com.hughes.exercises;

import java.util.*;

/*
 Q1)Write a Java program to remove duplicate elements from a given array and return the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array.

Q2)Program to find duplicate numbers in an array if it contains multiple duplicates?
 */

/**
 * @author bikas
 *
 */

public class Duplicates {

	public static int noOfUnique(int arr[], int n) {
		Arrays.sort(arr);
		int i = 0;
		int j = 0;
		int[] unique = new int[n];
		while (i < n) {
			unique[j] = arr[i];
			while (i < n && (arr[i] == unique[j]))
				i++;
			j++;
		}

		for (int k = 0; k < j; k++) {
			System.out.print(unique[k] + " ");
		}
		System.out.println();

		return j;
	}

	public static void duplicates(int arr[], int n) {
		Arrays.sort(arr);
		int temp = arr[0];
		int i = 0;
		System.out.print("Duplicates are: ");
		while (i < n - 1) {
			if (arr[i] == arr[i + 1]) {
				System.out.print(arr[i] + " ");
				temp = arr[i];
				while (i < n && (arr[i] == temp))
					i++;
			} else {
				i++;
			}

		}
	}

	public static void main(String[] args) {
		// given array
		int n;
		System.out.println("Enter how many numbers:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the numbers:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("No of Unique Numbers:" + noOfUnique(arr, n));
		duplicates(arr, n);

	}

}
