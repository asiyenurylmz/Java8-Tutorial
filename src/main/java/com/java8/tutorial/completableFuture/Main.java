package com.java8.tutorial.completableFuture;

import java.util.concurrent.CompletableFuture;

public class Main {

	public static void main(String[] args) {

		CompletableFuture<Void> futured1 = CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("5 seconds");
		});

		CompletableFuture<Void> futured2 = CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("3 seconds");
		});

		futured1.join();
		futured2.join();
	}
}
