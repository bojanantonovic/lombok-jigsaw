package person;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PersonWithBuilderAndGetter {

	private String secondName;

	private String firstName;

	private int age;
}
