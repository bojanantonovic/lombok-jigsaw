public class Main {

	public static void main(String... args) {
		final Person person = new Person("A", "B", 10);

		System.out.println(person.getFirstName());
		System.out.println(person.getSecondName());
		System.out.println(person.getAge());
	}
}
