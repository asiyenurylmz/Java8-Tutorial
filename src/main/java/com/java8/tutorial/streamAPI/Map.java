package com.java8.tutorial.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");

		Stream<String> stream = names.stream();
		Stream<String> upperStream = stream.map(name -> name.toUpperCase()); // Her bir ismin harfleri büyütülüyor.
		List<String> upperNames = upperStream.collect(Collectors.toList());

		//
		IntStream.rangeClosed(1, 5).map(n -> n * n).forEach(System.out::println); //1-5 arası sayıların karesi hesaplanır.

	}
}
