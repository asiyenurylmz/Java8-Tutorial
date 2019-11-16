package com.java8.tutorial.streamAPI;

import java.util.stream.IntStream;

public class Sorted {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(21, 13, 5, 4, 4, 8, 50, 1, 2, 3); //Sıralanmış Stream nesnesini döndürür.
		stream.sorted().forEach(System.out::println);
	}
}
