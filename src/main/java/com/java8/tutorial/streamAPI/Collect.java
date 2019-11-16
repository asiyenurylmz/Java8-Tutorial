package com.java8.tutorial.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");

		List<String> list = names.stream().collect(Collectors.toList());

		Set<String> set = names.stream().collect(Collectors.toSet());

		Long count = names.stream().collect(Collectors.counting()); // Stream nesnesinin eleman sayısını üretir.

		String collect = names.stream().collect(Collectors.joining(" - ")); // Stream nesnesini birleştirir. Ali-Veli-Selami-Can-Hüseyin

		Map<Integer, List<String>> integerListMap = names.stream().collect(Collectors.groupingBy(name -> name.length())); // Stream nesnesini isim uzunluğuna göre gruplar.
	}
}
