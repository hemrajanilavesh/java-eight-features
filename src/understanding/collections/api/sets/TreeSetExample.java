package understanding.collections.api.sets;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// maintains natural ordering of elements in default implementation
		// does not allow null elements
		// internally uses TreeMap
		Set<String> treeset = new TreeSet<String>();
		
		treeset.add("Banana");
		treeset.add("Apple");
		treeset.add("Orange");
		treeset.add("Grapes");
		
		System.out.println("Maintains natural ordering:" + Arrays.toString(treeset.toArray()));
		System.out.println("Conatins Apple ? -> " + treeset.contains("Apple"));
		System.out.println("Conatins apple ? -> " + treeset.contains("apple"));
	}

}
