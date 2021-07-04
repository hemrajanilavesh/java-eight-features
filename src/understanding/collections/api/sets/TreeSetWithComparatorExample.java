package understanding.collections.api.sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import understanding.lambdas.basics.Person;

public class TreeSetWithComparatorExample {

	public static void main(String[] args) {

		/*
		 * Comparator<Person> compareByAge = (Person p1, Person p2) -> { return
		 * p1.getAge() - p2.getAge(); };
		 */

		// if comparator is not given and POJO doesn't implement comparable
		// then it will result in java.lang.ClassCastException: Person cannot be cast to java.lang.Comparable
		Set<Person> people = new TreeSet<Person>(Comparator.comparingInt(Person::getAge));
		people.add(new Person("Charles", "Dickens", 60));
		people.add(new Person("Lewis", "Carroll", 42));
		people.add(new Person("Thomas", "Carlyle", 51));
		people.add(new Person("Charlotte", "Bronte", 45));
		
		System.out.println("Maintains order specified by comparator. By Age - Ascending Order");
		people.forEach(System.out::println);
		
		System.out.println("\nReverse the order of comparator. By Age - Descending Order");
		Set<Person> peopleReverseByAge = new TreeSet<Person>(Comparator.comparingInt(Person::getAge).reversed());
		peopleReverseByAge.addAll(people);
		peopleReverseByAge.forEach(System.out::println);
		
		
	}

}
