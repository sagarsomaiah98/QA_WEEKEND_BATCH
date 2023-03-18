package com.janbask.setEg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex1 {

	public static void main(String[] args) {
		
		//set doesnt store duplicate values
		
		Set<String> colors=new HashSet<String>();
		
		colors.add("RED");
		colors.add("BLUE");
		colors.add("WHITE");
		colors.add("BLACK");
		colors.add("ORANGE");
		colors.add("GREEN");
		/*
		 * colors.add("RED"); colors.add("WHITE"); colors.add("blue");
		 * colors.add("Green"); colors.add("black");
		 */
		
		System.out.println(colors.size());
		
		Iterator<String> it=colors.iterator();
		
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		/*
		 * for(int i=0;i<colors.size();i++) { System.out.println(it.next()); }
		 */
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		}

}
