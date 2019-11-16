package com.java8.tutorial.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ali", "Veli", "Cem", "Can", "Selami");

		Stream<String> stream = names.stream();

		Predicate<String> predicate = name -> name.length() < 4;

		Stream<String> filtered = stream.filter(predicate);

		filtered.forEach(System.out::println); // Listeleniyor. [Ali,Cem, Can]

		// yada
		names.stream().filter(name -> name.length() == 4).forEach(System.out::println);
	}
}
