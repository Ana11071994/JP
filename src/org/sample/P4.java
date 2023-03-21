package org.sample;

public class P4 {
public static void main(String[] args) {
	//method 1
	/*String s ="welcome",r="";
	
	System.out.println("welcome");
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		r = ch+ r;
	}
	System.out.println(r);*/
	//method 2
	String s ="welcome";
	StringBuffer sb = new StringBuffer(s);
	StringBuffer rstr = sb.reverse();
	System.out.println(rstr);
	
	
	
	
	
}
}
