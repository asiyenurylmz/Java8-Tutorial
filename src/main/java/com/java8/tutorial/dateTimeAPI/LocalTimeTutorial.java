package com.java8.tutorial.dateTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeTutorial {

	public static void main(String[] args) {

		// LocalTime sınıfı ile saatsel zaman temsil edilir.
		LocalTime now = LocalTime.now();
		LocalTime time = LocalTime.of(21, 18, 32); // 21:18:32

		time.getHour(); // 21
		time.getMinute(); // 18
		time.getSecond(); // 32

		LocalTime.parse("10:05"); // 10:05

		System.out.println(time.plusSeconds(45).minusSeconds(5).minus(5, ChronoUnit.SECONDS)); // 21:19:07

	}
}
