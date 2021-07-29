package com.vit.arraylist;

import java.util.ArrayList;

//how to create and insert elements into an ArrayList

public class Example1 {

	public static void main(String[] args) {
		
    //creating ArrayList
		
		ArrayList<String> al = new ArrayList<String>(); 

		al.add("mdits"); 
		al.add("md"); 
		al.add("mdits");//it will allow duplicate values also
		al.add(1, "For"); 
		al.add(2,"hello");
		al.add(null);//it will allow null values also
		al.add(null);
		al.set(3, "a");
		
		System.out.println(al.get(2));
		
		al.remove(1); //removes element at 1st index
		
		System.out.println(al.size());
		
		System.out.println(al.contains("hello"));
      
		System.out.println(al); 
	} 
} 

