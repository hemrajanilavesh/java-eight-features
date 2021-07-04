package understanding.collections.api.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

import understanding.lambdas.basics.Person;

/**
 * Linked Hash Set maintains insertion order. Allows one null element. contains
 * unique elements only and is not thread safe
 * 
 * @author Lavesh
 *
 */
public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<Person>();

		linkedHashSet.add(new Person("Charles", "Dickens", 60));
		linkedHashSet.add(new Person("Lewis", "Carroll", 42));
		linkedHashSet.add(new Person("Thomas", "Carlyle", 51));
		linkedHashSet.add(new Person("Charlotte", "Bronte", 45));

		System.out.println("People in Linked Hash Set. Maintains Insertion order.");
		
		Iterator<Person> personIterator = linkedHashSet.iterator();
		while (personIterator.hasNext()) {
			System.out.println(personIterator.next());
			
		}

		int filter = 45;
		linkedHashSet.removeIf(p -> p.getAge() > filter);
		System.out.println("Removing persons above the age of " + filter);
		linkedHashSet.stream().forEach(System.out::println);
	}

}
