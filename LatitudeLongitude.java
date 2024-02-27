package com.hughes.exercises;
import java.util.HashMap;
import java.util.Scanner;
/*
 create an program,which will display
latitude and longitude based on cityname.
Use Map .
 */

public class LatitudeLongitude {

	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		h1.put("Hyderabad", "17.360589");
		h1.put("Mumbai", "19.0815772");
		h1.put("Chennai", "13.0836939");
		h1.put("Calcutta", "22.5726459");
		h1.put("Bihar", "25.6440845");
		
		HashMap h2 = new HashMap();
		h2.put("Hyderabad", "78.4740613");
		h2.put("Mumbai", "72.8866275");
		h2.put("Chennai", "80.270186");
		h2.put("Calcutta", "88.3638953");
		h2.put("Bihar", "85.906508");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name:");
		String city=sc.nextLine();
		System.out.println("Lat:"+h1.get(city)+" Long:"+h2.get(city));
		
		

	}

}
