package understanding.lambdas.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExcrciseUsingJavaEightInterface {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// Step 1: Sort list by name
		Comparator<Person> compareByLastName = (Person p1, Person p2) -> {
			return p1.getLastName().compareTo(p2.getLastName());
		};

		Collections.sort(persons, compareByLastName);
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Step 2:");
		printConditionally(persons, p -> p.getAge() < 45, System.out::println);

		// Step 3: Create a method that prints all persons whose last name starts with
		// 'C'
		System.out.println("Step 3:");
		//printConditionally(persons, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getLastName()));
		persons.stream()
			   .filter(p -> p.getLastName().startsWith("C"))
			   .forEach(p -> System.out.println(p.getLastName())); // terminal operation
		
		
	}

	/**
	 * 
	 * @param people : input data
	 * @param predicate : condition to be applied on the input
	 * @param consumer : action to be performed on the input if condition is satisfied
	 */
	public static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
