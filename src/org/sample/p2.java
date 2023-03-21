package org.sample;

import java.util.Scanner;
// give Hai welcome to Python class as input replace python into java
public class p2 {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	System.out.println("enter the string:");
	String s = a.nextLine();
	System.out.println("the string is " +s);
	String str = s.substring(0, 14);
	System.out.println(str);
	String str1 = s.substring(21);
	System.out.println(str1);
	System.out.println(str + "java" +str1);
}
}
