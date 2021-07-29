package com.telstra;

public class Example_1_String {

	 public static void main (String[] args)
	{
	String [] fruits;

	fruits = new String[5];
	// Other ways to initialize the array.
	//String[] fruits = new String[6];
	//String[] fruits = {"mango", "apple", "grapes", "kiwi", "banana", "pineapple"};
	// initialize the first elements of the array

	fruits[0] = "apple";
	fruits[1] = "mango";
	fruits[2] = "banana";
	fruits[3] = "kiwi";
	fruits[4] = "watermelon";

	for (int i = 0; i < fruits.length; i++)
	System.out.println ("All Element at array index " + i + " : "+ fruits[i]);
	}
	}