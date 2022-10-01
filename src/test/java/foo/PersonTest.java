package foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testCompilation() {
		final var person = new Person();
		person.setFirstName("Donald");
		person.setSecondName("Duck");
		person.setAge(20);

		System.out.println(person.getFirstName());
		System.out.println(person.getSecondName());
		System.out.println(person.getAge());
		Assertions.assertTrue(false);
	}
}
