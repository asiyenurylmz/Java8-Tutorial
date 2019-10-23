package com.java8.tutorial.functionalinterface;

public class Main {
	public static void main(String[] args) {
		Foo foo = (x, y) -> (2 * x + y);
		System.out.println(foo.apply(3, 4));
	}
}
