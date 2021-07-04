package understanding.lambdas.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Excrcise {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by name
		Comparator<Person> compareByLastName = (Person p1, Person p2) -> {
				return p1.getLastName().compareTo(p2.getLastName());
			};
		
		Collections.sort(persons, compareByLastName);
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Step 2:");
		persons.forEach(System.out::println);
		
		// Step 3: Create a method that prints all persons whose last name starts with 'C'
		System.out.println("Step 3:");
		persons.forEach(p -> {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p.toString());
			}
		});
		

	}

}
