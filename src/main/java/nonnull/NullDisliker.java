package nonnull;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class NullDisliker {

	private final Object value;

	public NullDisliker(final @NonNull Object value) {
		this.value = value;
	}
}
