package org.sample;

public class P12 {
	public static void main(String[] args) {
		/*String l ="Programming";
		for (int i = 0; i < l.length(); i++) {
			char c = l.charAt(i);
			if (c=='m') {
				System.out.println("index position of m:"+i);
			}
		}*/
		
		String l ="Programming";
		char c ='P';
		int count =0;
		for (int i = 0; i < l.length(); i++) {
			if (c==l.charAt(i)) {
				count++;
				
			}
		}
		System.out.println("count of"+ c + "is" +count);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
