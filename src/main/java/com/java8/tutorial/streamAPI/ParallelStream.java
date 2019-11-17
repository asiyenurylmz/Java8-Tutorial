package com.java8.tutorial.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,3,5,7,9,11,13,15);
		Stream<Integer> parallelStream = ints.parallelStream();	//Paralel
		Stream<Integer> stream= parallelStream.sequential();	//Ardışıl
	}
}
