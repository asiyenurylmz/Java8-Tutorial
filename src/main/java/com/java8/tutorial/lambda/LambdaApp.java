package com.java8.tutorial.lambda;

public class LambdaApp {
	public int fonk(int a, int b, LambdaIntf anonim) {
		return anonim.call(a, b) * 2;
	}
}
