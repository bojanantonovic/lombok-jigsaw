package main;

import person.PersonWithData;

public class Main {

	public static void main(String... args) {
		final var person = new PersonWithData();

		person.setFirstName("Donald");
		person.setSecondName("Duck");
		person.setAge(20);

		System.out.println(person.getFirstName());
		System.out.println(person.getSecondName());
		System.out.println(person.getAge());
	}
}
