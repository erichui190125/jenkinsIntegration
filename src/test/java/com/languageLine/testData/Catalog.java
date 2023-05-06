package com.languageLine.testData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class Catalog {
	
	

	
	public Map allMaps() {
		
		Map<String, Map<String, Integer>> outerMap = new HashMap<String, Map<String, Integer>>();

		// Create the first inner HashMap
		HashMap<String, Integer> phonesMap = new HashMap<String, Integer>();
		HashMap<String, Integer> laptopsMap = new HashMap<String, Integer>();
		HashMap<String, Integer> monitorsMap = new HashMap<String, Integer>();

		
		//ADD ALL PHONES WITH THEIR RESPECTIVE PRICES HERE AS CATALOG CHANGES

		phonesMap.put("Samsung galaxy s6", 360);
		phonesMap.put("Nokia lumia 1520", 820);
		phonesMap.put("Nexus 6", 650);
		phonesMap.put("Samsung galaxy s7", 800);
		phonesMap.put("Iphone 6 32gb", 790);
		phonesMap.put("Sony xperia z5", 320);
		phonesMap.put("HTC One M9", 700);
		
		//ADD ALL LAPTOPS WITH THEIR RESPECTIVE PRICES HERE AS CATALOG CHANGES

		laptopsMap.put("Sony vaio i5", 790);
		laptopsMap.put("Sony vaio i7", 790);
		laptopsMap.put("MacBook air", 700);
		laptopsMap.put("Dell i7 8gb", 700);
		laptopsMap.put("2017 Dell 15.6 Inch", 700);
		laptopsMap.put("MacBook Pro", 1100);
		
		//ADD ALL MONITORS WITH THEIR RESPECTIVE PRICES HERE AS CATALOG CHANGES

		
		monitorsMap.put("Apple monitor 24", 400);
		monitorsMap.put("ASUS Full HD", 230);
		
		// Add the inner HashMaps to the outer HashMap
		outerMap.put("phones", phonesMap);
		outerMap.put("laptops", laptopsMap);
		outerMap.put("monitors", monitorsMap);
		return outerMap;
		
		
	}

}
