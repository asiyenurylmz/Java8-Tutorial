package com.java8.tutorial.functionalInterface;

public class Bar {
	public int calculate(Foo foo, int x, int y) {
		return foo.apply(x, y);
	}
}
