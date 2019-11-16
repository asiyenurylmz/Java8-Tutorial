package com.java8.tutorial.streamAPI;

import java.util.stream.LongStream;

public class Limit {
	public static void main(String[] args) {
		LongStream range = LongStream.range(1, 10000); // İlk N veriyi barındıran yeni bir Stream nesnesi
		range.limit(10).forEach(System.out::println);
	}
}
