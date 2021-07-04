package understanding.collections.api.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import understanding.lambdas.basics.Person;

/**
 * WeakHashMap is same as HashMap in terms of functionality and performance.
 * It automatically removes object keys which are not longer externally referenced.
 * i.e if a key is ready to be garbage collected, it will remove it from map.
 * 
 * @author Lavesh
 *
 */
public class WeakHashMapExample {

	public static void main(String[] args) {
		
		Person personOne = new Person("Charlotte", "Bronte", 45);
		Person personTwo = new Person("Lewis", "Carroll", 42);
		Person personThree = new Person("Thomas", "Carlyle", 51);
		
		Map<Person, Integer> weakHashMap = new WeakHashMap<Person, Integer>(3, 0.75f);
		
		weakHashMap.put(personOne, 1);
		weakHashMap.put(personTwo, 2);
		weakHashMap.put(personThree, 3);
		
		System.out.println("All Keys are externally referenced.");
		weakHashMap.keySet().forEach(System.out::println);
		
		System.out.println("\nRemoving a key reference.");
		
		personTwo = null;
		System.gc();
		
		weakHashMap.keySet().forEach(System.out::println);
		

	}

}
