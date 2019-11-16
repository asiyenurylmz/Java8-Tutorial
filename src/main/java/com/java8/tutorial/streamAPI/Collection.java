package com.java8.tutorial.streamAPI;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Collection<E> extends Iterable<E> {

	// Collection arayüzü türünden türeyen tüm nesneler, stream() veya
	// parallelStream() metodlarını çağırarak Stream<E> türünden bir nesne elde
	// edebilmektedir.
	default Stream<E> stream() {
		return StreamSupport.stream(spliterator(), false);

	}

	default Stream<E> parallelStream() {
		return StreamSupport.stream(spliterator(), true);
	}
}
