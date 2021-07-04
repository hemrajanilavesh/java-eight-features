package understanding.lambdas.basics;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		// this is external iteration
		// programmer controls this
		for (int i=0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		
		// this is external iteration
		// programmer controls this
		for (Person person : persons) {
			System.out.println(person);
		}
		
		// internal iteration
		// compiler controls the iteration here
		persons.forEach(System.out::println);

	}

}
