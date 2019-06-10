package com.scp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
*				
* shital
*/

public class ListExample {
	
	public static void main(String[] args) {
		
	//	List<student> l=new ArrayList<student>();
		LinkedList<String> l=new LinkedList();
		l.add("A");
		
		
		/*
		 * student s1=new student(); student s2=new student(); student s3=new student();
		 * 
		 * l.add(s1); l.add(s2); l.add(s3); l.add(s1); l.add(s2);
		 * System.out.println(l.lastIndexOf(s2)); System.out.println( l.indexOf(s2));
		 */
		
	l.add("cjkchkc");
	l.add("dsbviu");
	l.add("a");
	l.add("a");//
		  System.out.println(l);
		  int i=l.indexOf("cjkchkc"); 
		  System.out.println(i);
		  l.set(0, "abc"); 
		  System.out.println(l);
		   l.get(0); //
		  System.out.println(l); l.remove(0);
		  System.out.println(l); l.addAll(l);
		  System.out.println(l); l.clear();
		  System.out.println(l);
		  
		 		
	}

}
