package com.scp.collection;

import java.util.ArrayList;
import java.util.List;

/**
*				
* shital
*/

public class CollectionMethod {

	public static void main(String[] args) {
		// inside main of collection method class
		
		System.out.println("inside main");
		 List<Integer> l1 = new ArrayList<Integer>(); 
	        l1.add(0, 1);  // adds 1 at 0 index 
	        l1.add(1, 2);  // adds 2 at 1 index 
	       
	        System.out.println(l1);  // [1, 2] 
	  
	        // Creating another list 
	        List<Integer> l2 = new ArrayList<Integer>(); 
	        l2.add(1); 
	        l2.add(2); 
	        l2.add(3); 
	        l2.indexOf(l1);
	        
	        System.out.println(l2);
	        
	        // Will add list l2 from 1 index 
	        l1.addAll(1, l2); 
	        System.out.println(l1); 
	  
	        // Removes element from index 1 
	        l1.remove(1);      
	        System.out.println(l1); // [1, 2, 3, 2] 
	  
	        // Prints element at index 3 
	        System.out.println(l1.get(3)); 
	  
	        // Replace 0th element with 5 
	        l1.set(0, 5);    
	        System.out.println(l1);  
	  
	}
}
class student{
	private int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}