package com.java8.tutorial.streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) throws IOException {

		// Bazı I/O sınıfları üzerinden Stream nesneleri elde edilebilmektedir.
		Path dir = Paths.get("");
		Stream<Path> pathStream = Files.list(dir);

		// IntStream, DoubleStream, LongStream
		IntStream intOf = IntStream.of(1, 2, 3); // (1,2,3) içeren IntStream nesnesi

		IntStream intRange = IntStream.range(1, 10); // (1,...,10) arasını içeren IntStream nesnesi

		DoubleStream doubleOf = DoubleStream.of(1.2, 2.5, 6.6); // (1.2,2.5,6.6) DoubleStream nesnesi

		LongStream longOf = LongStream.of(3, 5, Long.MAX_VALUE, 9);

		LongStream longRange = LongStream.range(1, 100);

	}
}
