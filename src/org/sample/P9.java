package org.sample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P9 {
	public static void main(String[] args) {
		// for get one key
	   Map<Integer,String> m = new LinkedHashMap<>();
		m.put(10, "selenium");
		m.put(20,"java");
		m.put(30, "oracle");
		m.put(40, "linux");
		String value ="selenium";
	    Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			if (entry.getValue()==value) {
				System.out.println("the key :"+entry.getKey());
			}
		}
		// For get one value
	/*	Map<Integer,String> m = new LinkedHashMap<>();
		m.put(10, "selenium");
		m.put(20,"java");
		m.put(30, "oracle");
		m.put(40, "linux");
		Integer key =20;
	    Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			if (entry.getKey()==key) {
				System.out.println("the key :"+entry.getValue());*/
		
		
}
}	