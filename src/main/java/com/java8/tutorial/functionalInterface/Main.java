package com.java8.tutorial.functionalInterface;

public class Main {
	public static void main(String[] args) {
		Foo foo = (x, y) -> (2 * x + y);
		System.out.println(foo.apply(3, 4));

		Bar bar = new Bar();
		System.out.println(bar.calculate((x, y) -> (2 * x + y), 5, 4));
	}
}
