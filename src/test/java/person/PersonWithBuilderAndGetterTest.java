package person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonWithBuilderAndGetterTest {

	@Test
	void builderDemo() {
		// arrange
		final var person = PersonWithBuilderAndGetter.builder() //
				.firstName("Donald") //
				.secondName("Duck") //
				.age(20) //
				.build();

		// assert
		assertEquals("Donald", person.getFirstName());
		assertEquals("Duck", person.getSecondName());
		assertEquals(20, person.getAge());
	}
}
