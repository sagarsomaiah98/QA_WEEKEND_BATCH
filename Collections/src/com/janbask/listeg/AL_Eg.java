package com.janbask.listeg;

import java.util.ArrayList;
import java.util.List;

public class AL_Eg {

	public static void main(String[] args) {
		
		List<String> students= new ArrayList<String>();
		students.add("Henry");
		students.add("Lee");
		students.add("Mark");
		students.add("Mark");
		//System.out.println(students.size());
		
         students.add("Joe");
         students.add("Alex");
        // System.out.println(students.size());
         students.remove(0);
         students.add(0, "James");
         
        
         
         System.out.println(students.size());
         for(int i=0;i<students.size();i++) {
        	 
        	 System.out.println(students.get(i));
         }
	}

}
