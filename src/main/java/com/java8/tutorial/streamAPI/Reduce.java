package com.java8.tutorial.streamAPI;

import java.util.stream.IntStream;

public class Reduce {
	public static void main(String[] args) {
		int result = IntStream.of(1, 2, 3, 4, 5).reduce(0, (after, before) -> {
			return after + before; // Bir önceki adımda hesaplanan değer bir sonrakinin girdisi olur. Identity
									// değeri toplamada etkisiz olan 0 seçildi.
		});
	}
}
