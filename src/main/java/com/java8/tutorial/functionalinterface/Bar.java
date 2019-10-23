package com.java8.tutorial.functionalinterface;

public class Bar {
	public int calculate(Foo foo, int x, int y) {
		return foo.apply(x, y);
	}
}
