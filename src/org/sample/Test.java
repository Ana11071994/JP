package org.sample;

public class Test {
public static void main(String[] args) {
	String s = "welcome",revs="";
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		revs=c+revs;
	}
	System.out.println("the reverse:"+revs);
	
}
}
