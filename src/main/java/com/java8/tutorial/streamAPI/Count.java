package com.java8.tutorial.streamAPI;

import java.util.stream.IntStream;

public class Count {
	public static void main(String[] args) {
		IntStream range = IntStream.range(1, 10);
		IntStream rangeClsoed = IntStream.rangeClosed(1, 10); 

		System.out.println(range.count()); // 9
		System.out.println(rangeClsoed.count()); // 10
	}
}
