package com.hughes.exercises;
//import java.util.HashTable;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

/*
 Assume there is a hashtable with below values.
Srinivas,srinivas,laptop,Laptop,Edu,Tech.Design code which shld display index of duplicate values(pls ignore case).
 */
public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h1 = new Hashtable();
		h1.put(1,"Srinivas");
		h1.put(2,"srinivas");
		h1.put(3,"laptop");
		h1.put(4,"Laptop");
		h1.put(5,"Edu");
		h1.put(6,"Tech");
		Set k1 = h1.keySet();
		for(Object key1 : h1.keySet()) {
//			System.out.println(key1);
			String first =(String) h1.get(key1);
			first=first.toLowerCase();
			for(Object key2 : h1.keySet()) {
				String second =(String) h1.get(key2);
				second=second.toLowerCase();
				if(key2!=key1 && first.equals(second)) {
					System.out.print(key1+" ");
				}
			}
			
		}
		
		
		

	}

}
