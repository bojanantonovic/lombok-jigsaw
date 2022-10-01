package main;

import person.PersonWithBuilderAndGetter;

public class MainWithBuilder {

	public static void main(String... args) {
		final var person = PersonWithBuilderAndGetter.builder()
				.firstName("Donald") //
				.secondName("Duck") //
				.age(20) //
				.build();

		System.out.println(person.getFirstName());
		System.out.println(person.getSecondName());
		System.out.println(person.getAge());
	}
}
