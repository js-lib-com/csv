package js.csv.fixture;

public class Person {
	private final String name;
	private final int age;

	public Person() {
		this.name = null;
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
