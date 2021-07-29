package com.telstra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Student {
	
}

public class StreamExample {

	public static void main(String[] args) {
		
		// empty stream
//		Stream<Student> emptyStream = Stream.empty();
//		System.out.println(emptyStream.count());
		
		// stream of type t
		//Method Signature : public static<T> Stream<T> of(T t)
		//Type Of Method : Static Method

		Stream<Student> singleElementStream = Stream.of(new Student());
		System.out.println(singleElementStream.count());
		
		//stream of 
		Stream<Integer> streamOfNumbers = Stream.of(7, 2, 6, 9, 4, 3, 1);
		System.out.println(streamOfNumbers.count());

		//list
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("One");
		listOfStrings.add("Two");
		listOfStrings.add("Three");
		listOfStrings.stream().forEach(System.out::println);
	}

}
