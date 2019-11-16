package com.java8.tutorial.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEach {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ali", "Veli", "Cem", "Can", "Selami");

		Stream<String> stream = names.stream();

		stream.forEach(name -> {
			System.out.println(name);
		});
	}
}
