package understanding.lambdas.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import understanding.collections.api.polymorphic.CollectionDataManipulationExamples;

/**
 * Compare Two Persons
 * First Compare by Age
 * Then by Last Name
 * Then by First Name
 * 
 * @author Lavesh
 *
 */
public class ComparatorChainingExample {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		CollectionDataManipulationExamples.addMembersToList(people);
		System.out.println("Default List:");
		CollectionDataManipulationExamples.printList(people);
		
		System.out.println("\nList after re-ordering / sorting");
		Collections.sort(people, Comparator.comparing(Person::getAge).thenComparing(Person::getLastName)
				.thenComparing(Person::getFirstName));
		CollectionDataManipulationExamples.printList(people);
	}

}
