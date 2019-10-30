package com.java8.tutorial.dateTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTutorial {

	// ZonedDateTime sınıfı saat dilimi eklenmiş LocalDateTime sınıfıdır.

	public static void main(String[] args) {

		ZonedDateTime.now();

		ZoneId istanbul = ZoneId.of("Europe/Istanbul");
		ZonedDateTime.now(istanbul);

		ZonedDateTime.now(ZoneId.of("Japan")); // Japonya'da tarih/saat kaç?

	}

}
