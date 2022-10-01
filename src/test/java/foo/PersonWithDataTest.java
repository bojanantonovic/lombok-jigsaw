package foo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonWithDataTest {

	@Test
	void testCompilation() {
		// arrange
		final var person = new PersonWithData();
		person.setFirstName("Donald");
		person.setSecondName("Duck");
		person.setAge(20);

		// assert
		assertEquals("Donald", person.getFirstName());
		assertEquals("Duck", person.getSecondName());
		assertEquals(20, person.getAge());
	}
}
