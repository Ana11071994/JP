package org.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserdefinedE {
	public static void main(String[] args) {
		Userdefined s = new Userdefined();
		
		s.setStudentid(123);
		s.setStudentname("arun");
		s.setStudentphoneno(9823853776l);
		//list
		List<Userdefined> l = new ArrayList<>();
		l.add(s);
		for (int i = 0; i < l.size(); i++) {
			System.out.println("id :"+l.get(i).getStudentid());
			System.out.println("name: "+l.get(i).getStudentname());
			System.out.println("phoneno :" +l.get(i).getStudentphoneno());
			
		}
		
		//set
		Set<Userdefined> t = new LinkedHashSet<>();
		t.add(s);
		for (Userdefined u : t) {
			System.out.println("id :"+u.getStudentid());
			System.out.println("name:" +u.getStudentname());
			System.out.println("phoneno : "+u.getStudentphoneno());
		}
		
		Map<Integer, Userdefined> m = new LinkedHashMap<>();
		m.put(1,s);
		Set<Entry<Integer, Userdefined>> entrySet = m.entrySet();
		for (Entry<Integer, Userdefined> en : entrySet) {
			System.out.println("id :" +en.getValue().getStudentid());
			System.out.println("name:"+en.getValue().getStudentname());
			System.out.println("phone no:" +en.getValue().getStudentphoneno());
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	 
	 

}
