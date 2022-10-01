package nonnull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NullDislikerTest {

	@Test
	void null_throwsNullPointerException() {
		Assertions.assertThrows(NullPointerException.class, //
				() -> new NullDisliker(null));
	}

	@Test
	void legalValue_noException() {
		// arrange
		final var testee = new NullDisliker("abc");
		// assert
		assertEquals("abc", testee.getValue());
	}
}
