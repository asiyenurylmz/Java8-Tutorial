package com.java8.tutorial.dateTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTutorial {
	public static void main(String[] args) {

		//LocalDate sınıfı ile tarihsel zaman temsil edilir.
		// "of"
		LocalDate.of(2019, 10, 30); // 2019-10-30
		LocalDate.of(2019, Month.OCTOBER, 30); // 2019-10-30 (Month enum)

		// "now" methodu ile o anın tarihi setlenir.
		LocalDate now = LocalDate.now(); // 2019-10-30

		// "with" methodu ile eldeki LocalDate için gün, ay, yıl alanları
		// düzenlenebilir. LocalDate sınıfı immutable olduğundan with methodu farklı bir
		// LocalDate nesnesi döndürür. O anki nesneyi değiştirmez.
		now.withYear(2020); // 2020-10-30;
		now.withMonth(11).withDayOfMonth(20); // 2019-11-20, Immutable olduğu için 2020 olarak değişmedi.
		now.with(ChronoField.YEAR, 2010).with(ChronoField.MONTH_OF_YEAR, 8).with(ChronoField.DAY_OF_MONTH, 30); // 2010-8-3;

		// "plus" methodu LocalDate nesnesinin gün, ay ve yıl alanlarını ayrı ayrı
		// arttırabilir.
		now.plusWeeks(2).plusDays(5).plusMonths(1);
		now.plus(2, ChronoUnit.WEEKS).plus(3, ChronoUnit.YEARS).plus(3, ChronoUnit.DECADES);

		// "minus" methodu LocalDate nesnesinin gün, ay, yıl alanlarını ayrı ayrı
		// azaltabilir.
		now.minusDays(5).minusMonths(2);
		now.minus(2, ChronoUnit.WEEKS).minus(3, ChronoUnit.YEARS).minus(50, ChronoUnit.DAYS);

	}

}
