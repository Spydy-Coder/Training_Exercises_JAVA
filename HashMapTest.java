package com.hughes.exercises;
import java.util.HashMap;

/*
 assume there is an array with 6 elementsie {bat,rat,cat,mat,TV,Laptop}.
Deisgn a hashmap whose values are same as array element  value and whose keys are index no in hashmap.
 */

public class HashMapTest {
	
	

	public static void main(String[] args) {
		
		String[] arr = {"bat","rat","cat","mat","TV","Laptop"};
		HashMap h1 = new HashMap();
		
		for(int i=0;i<6;i++) {
			h1.put(i,arr[i]);
			
			
		}
		System.out.println(h1);
		// TODO Auto-generated method stub

	}

}
