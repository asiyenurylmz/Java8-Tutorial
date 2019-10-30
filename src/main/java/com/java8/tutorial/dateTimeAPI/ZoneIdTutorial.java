package com.java8.tutorial.dateTimeAPI;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTutorial {

	public static void main(String[] args) {

		// ZoneId sınıfı, dünya üzerindeki saat dilimlerinin Java taraflı nesnel
		// karşılıkları temsil edilir.
		Set<String> zones = ZoneId.getAvailableZoneIds();
		zones.stream().sorted().forEach(System.out::println); // Tüm saat dilimleri sıralı olarak listelenir.
		
		ZoneId.systemDefault(); // O anki çalışılan makinedeki saat dilimini döndürür.
	}

}
