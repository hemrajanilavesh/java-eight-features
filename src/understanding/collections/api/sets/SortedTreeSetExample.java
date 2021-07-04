package understanding.collections.api.sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import understanding.lambdas.basics.Person;

public class SortedTreeSetExample {

	public static void main(String[] args) {

		/*
		 * Comparator<Person> compareByLastName = (p1, p2) -> { return
		 * p1.getLastName().compareTo(p2.getLastName()); };
		 */

		SortedSet<Person> people = new TreeSet<Person>(Comparator.comparing(Person::getLastName)); // lambda for compare by LastName

		Person from = new Person("Charlotte", "Bronte", 45);
		Person to = new Person("Lewis", "Carroll", 42);

		people.add(new Person("Charles", "Dickens", 60));
		people.add(to);
		people.add(new Person("Matthew", "Arnold", 39));
		people.add(new Person("Thomas", "Carlyle", 51));
		people.add(from);

		System.out.println("Sorted Set Example. Sorted by Last Name");
		people.forEach(System.out::println);

		System.out.println(System.lineSeparator());

		System.out.println("Printing subset. toElement is exclusive.");
		people.subSet(from, to).forEach(System.out::println);

		System.out.println(System.lineSeparator());

		System.out.println("Printing Tailset. Prints elements >= given element");
		people.tailSet(from).forEach(System.out::println);

		System.out.println(System.lineSeparator());
		System.out.println("Last Person : " + people.last());

		System.out.println(System.lineSeparator());
		System.out.println("First Person : " + people.first());

		SortedSet<Person> reversePeople = new TreeSet<Person>(Collections.reverseOrder(Comparator.comparing(Person::getLastName))); // lambda for compare by LastName

		reversePeople.addAll(people);

		System.out.println("Reversing the Set of People.");
		reversePeople.forEach(System.out::println);

	}

}
