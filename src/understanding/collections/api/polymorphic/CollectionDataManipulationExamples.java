package understanding.collections.api.polymorphic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import understanding.lambdas.basics.Person;

/**
 * Demonstrating the polymorphic algorithms provided by Collections class
 * 
 * @author Lavesh
 *
 */
public class CollectionDataManipulationExamples {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		addMembersToList(people);
		System.out.println("Before Shuffle\n");
		printList(people);

		System.out.println("\nAfter Shuffle\n");
		Collections.shuffle(people);
		printList(people);

		System.out.println("\nAfter Reversal\n");
		Collections.reverse(people);
		printList(people);

		int rotateDistance = 2;
		System.out.println("\nRotating the elements by a distance of " + rotateDistance + "\n");
		Collections.rotate(people, rotateDistance);
		printList(people);

		int i = 0, j = 1;
		System.out.println("\nSwapping elements at index i=" + i + ", j=" + j + "\n");
		Collections.swap(people, 0, 1);
		printList(people); 
		
		System.out.println("\n Searching an element in an ordered list\n");
		Collections.sort(people); // must be done before binary search
		System.out.println(Collections.binarySearch(people, people.get(j)));
	}

	public static void printList(List<Person> people) {
		Iterator<Person> personItr = people.iterator();

		while (personItr.hasNext()) {
			System.out.println(personItr.next());
		}

	}

	public static void addMembersToList(List<Person> linkedPeople) {
		linkedPeople.add(new Person("Charles", "Dickens", 60));
		linkedPeople.add(new Person("Lewis", "Carroll", 42));
		linkedPeople.add(new Person("Lewis", "Darroll", 42));
		linkedPeople.add(new Person("Levis", "Carroll", 42));
		linkedPeople.add(new Person("Thomas", "Carlyle", 51));
		linkedPeople.add(new Person("Charlotte", "Bronte", 45));
		/*
		 * Comparator<Person> compareByName = (Person p1, Person p2) -> { return
		 * p1.getLastName().compareTo(p2.getLastName()); };
		 */
		linkedPeople.sort(Comparator.comparing(Person::getLastName));
		System.out.println(System.lineSeparator());
	}

}
