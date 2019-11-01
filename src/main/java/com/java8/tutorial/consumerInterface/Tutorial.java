package com.java8.tutorial.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Tutorial {

	public static void main(String[] args) {

		// 1
		Consumer<String> consumer = (String msg) -> {
			System.out.println(msg);
		};
		consumer.accept("Hello World");

		// 2
		Consumer<String> consumer2 = (msg) -> {
			System.out.println(msg);
		};
		consumer2.accept("Hello World");

		// 3
		Consumer<String> consumer3 = e -> {
			System.out.println(e);
		};
		consumer3.accept("Hello World");

		// 4
		Consumer<String> consumer4 = App::list;
		consumer4.accept("Hello World");

	}
}
