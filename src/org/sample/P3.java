package org.sample;

import java.util.Scanner;
//p3 swap two numbers without using third variable
public class P3 {
public static void main(String[] args) {
	System.out.println("enter the value of x and y:");
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int y = s.nextInt();
	System.out.println("before swapping x: "+x);
	System.out.println("before swapping y:"+y);
	//swapping
	x= x+y;
	y=x-y;
	x=x-y;
	System.out.println("after swap:" +x);
	System.out.println("after swap : " +y);
}
}
