package com.java8.tutorial.lambda;

public class LambdaTutorial {
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		System.out.println(app.fonk(7, 7, (a, b) -> a + b));
	}
}
