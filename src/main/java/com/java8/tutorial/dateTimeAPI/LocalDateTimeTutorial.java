package com.java8.tutorial.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class LocalDateTimeTutorial {

	public static void main(String[] args) {
		// LocalDateTime sınıfı ile hem tarihsel hem saatsel zaman temsil edilir.

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime dateTime = LocalDateTime.of(2014, Month.JANUARY, 3, 4, 5, 45); // Year-Month-Day-Hour-Minute-Second

		dateTime.getYear(); // 2014
		dateTime.getMonth(); // January
		dateTime.getDayOfMonth(); // 3
		dateTime.getHour(); // 4
		dateTime.getMinute(); // 5
		dateTime.getSecond(); // 45;

		LocalDate date = dateTime.toLocalDate();
		LocalTime time = dateTime.toLocalTime();

		dateTime.minusDays(3).plusYears(5).plusMinutes(20).minusWeeks(6).plusSeconds(2)
		.plus(3, ChronoUnit.DECADES).minus(4, ChronoUnit.DECADES);
	}

}
