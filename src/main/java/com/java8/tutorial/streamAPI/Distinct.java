package com.java8.tutorial.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Distinct {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(1, 1, 5, 4, 4, 8, 9, 1, 2, 3); // Tekrarlı veriler çıkarılır.

		stream.distinct().forEach(System.out::println);
	}
}
