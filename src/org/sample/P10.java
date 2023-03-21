package org.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class P10 {
	//p : 8 create list insert values and iterate
  	public static void main(String[] args) {
		
	/*List<Integer> l = new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	System.out.println(l);
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));
	}*/
	// p : 9 set iterate
	/*Set<Integer> s = new LinkedHashSet<>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	System.out.println(s);
	for (Integer a : s) {
		System.out.println(a);
	}*/
	//p :10
    /*Map<Integer,String> m = new LinkedHashMap<>();
	m.put(10, "java");
	m.put(20,"selenium");
	m.put(30, "oracle");
	m.put(40, "linux");
	System.out.println(m);
	Set<Entry<Integer, String>> en = m.entrySet();
	for (Entry<Integer, String> a : en) {
		System.out.println(a);
	}*/
	//p:11
  	/*	Map<Integer,String> m = new LinkedHashMap<>();
  		m.put(10, "java");
  		m.put(20,"selenium");
  		m.put(30, "oracle");
  		m.put(40, "linux");
  		System.out.println(m);
  		Set<Entry<Integer, String>> en = m.entrySet();
  		for (Entry<Integer, String> a : en) {
  			
  		}
  			for (Entry<Integer, String> ss : en) {
				System.out.println("key :"+ss.getKey() );
				System.out.println("value :" +ss.getValue());
			}*/
  		//
  			Map<Integer,String> m = new LinkedHashMap<>();
  	  		m.put(10, "java");
  	  		m.put(20,"selenium");
  	  		m.put(30, "oracle");
  	  		m.put(40, "linux");
  	  		System.out.println(m);
  	  		Set<Entry<Integer, String>> en = m.entrySet();
  	  		for (Entry<Integer, String> a : en) {
  	  			
  	  		}
  	  			for (Entry<Integer, String> ss : en) {
  					System.out.println("key :"+ss.getKey() );
  	
  	  			}
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
	
	
}
	
	
	
}
	
	
	


