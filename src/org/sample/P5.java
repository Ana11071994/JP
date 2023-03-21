package org.sample;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class P5 {
public static void main(String[] args) {
	//method 1
	/*List<String> l = new LinkedList<>();
	l.add("java");
	l.add("testing");
	l.add("selenium");
	l.add("webdriver");
	l.add("testng");
	System.out.println(l);
	l.remove(4);
	System.out.println(l);*/
	
	//method 2
	String[] a =  new String[5];
	a[0]="java";
	a[1]="testing";
	a[2]="selenium";
	a[3]="webdriver";
	a[4]="testng";
	
	for (int i = 0; i < a.length; i++) {
		if (i==4) {
			break;
		}
		System.out.println(a[i]);
	}
	 

	
	
}	
}
