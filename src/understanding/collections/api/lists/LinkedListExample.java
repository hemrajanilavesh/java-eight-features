package understanding.collections.api.lists;

import java.util.Comparator;
import java.util.LinkedList;

import understanding.lambdas.basics.Person;

/**
 * 
 * Manipulation of linked list is faster than array list. Uses Doubly Linked
 * List internally for implementation. linked list can be used as list, queue
 * and stack
 * 
 * @author Lavesh
 *
 */

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<Person> linkedPeople = new LinkedList<Person>(); 

		addMembersToList(linkedPeople);

		System.out.println("Printing the List:");
		linkedPeople.forEach(System.out::println);

		linkedListOperations(linkedPeople);

		LinkedList<Person> linkedListAsStack = new LinkedList<Person>();

		linkedListAsStack(linkedPeople, linkedListAsStack);

		LinkedList<Person> linkedListAsQueue = new LinkedList<Person>();

		linkedListAsQueue(linkedPeople, linkedListAsQueue);

	}

	private static void linkedListAsQueue(LinkedList<Person> linkedPeople, LinkedList<Person> linkedListAsQueue) {
		System.out.println(System.lineSeparator());
		for (int i = 0; i < linkedPeople.size(); i++) {
			System.out.println("Enqueue operation -> " + linkedPeople.get(i));
			linkedListAsQueue.add(linkedPeople.get(i));
		}

		System.out.println(System.lineSeparator());
		System.out.println("Peek Operation -> " + linkedListAsQueue.peek());
		System.out.println("Peek First Operation -> " + linkedListAsQueue.peekFirst());
		System.out.println("Peek Last Operation -> " + linkedListAsQueue.peekLast());
		System.out.println("Poll Operation -> " + linkedListAsQueue.poll());
		System.out.println("Poll First Operation -> " + linkedListAsQueue.pollFirst());
		System.out.println("Poll Last Operation -> " + linkedListAsQueue.pollLast());

		System.out.println(System.lineSeparator());
		for (int i = 0; i < linkedListAsQueue.size(); i++) {
			System.out.println("Dequeue operation -> " + linkedListAsQueue.remove());
		}
	}

	private static void linkedListAsStack(LinkedList<Person> linkedPeople, LinkedList<Person> linkedListAsStack) {
		System.out.println(System.lineSeparator());

		for (int i = 0; i < linkedPeople.size(); i++) {
			System.out.println("Pushing person to stack : " + linkedPeople.get(i));
			linkedListAsStack.push(linkedPeople.get(i));
		}

		System.out.println(System.lineSeparator());

		for (int i = 0; i < linkedListAsStack.size(); i++) {
			System.out.println("Popping person from stack : " + linkedListAsStack.pop());
		}
	}

	private static void linkedListOperations(LinkedList<Person> linkedPeople) {
		System.out.println(System.lineSeparator());
		System.out.println("Removing the 1st element -> " + linkedPeople.removeFirst());
		System.out.println("Removing the Last element -> " + linkedPeople.removeLast());
		linkedPeople.clear();
		System.out.println("Reset the List.");
		addMembersToList(linkedPeople);
	}

	private static void addMembersToList(LinkedList<Person> linkedPeople) {
		linkedPeople.add(new Person("Charles", "Dickens", 60));
		linkedPeople.add(new Person("Lewis", "Carroll", 42));
		linkedPeople.add(new Person("Thomas", "Carlyle", 51));
		linkedPeople.add(new Person("Charlotte", "Bronte", 45));
		linkedPeople.addFirst(new Person("Ramesh", "Taurani", 40));
		linkedPeople.addLast(new Person("Vijay", "Shankar", 40));
		/*
		 * Comparator<Person> compareByName = (Person p1, Person p2) -> { return
		 * p1.getFirstName().compareTo(p2.getFirstName()); };
		 */
		linkedPeople.sort(Comparator.comparing(Person::getFirstName));
		System.out.println(System.lineSeparator());
	}

}
