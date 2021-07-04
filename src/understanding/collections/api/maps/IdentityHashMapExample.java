package understanding.collections.api.maps;

import java.util.IdentityHashMap;

/**
 * Normal HashMap compares two objects using equals method. Identity Map
 * compares using == operator.
 *
 * Initial Capacity of Identity Hash Map is 21
 * 
 * @author Lavesh
 *
 */
public class IdentityHashMapExample {

	public static void main(String[] args) {

		final IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<String, String>();

		identityHashMap.put("a", "Java");
		identityHashMap.put(new String("a"), "J2EE");
		identityHashMap.put("b", "J2SE");
		identityHashMap.put(new String("b"), "Spring");
		identityHashMap.put("c", "Hibernate");

		for (final String str : identityHashMap.keySet()) {
			System.out.println("Key : " + str + " and Value : " + identityHashMap.get(str));
		}

		System.out.println("Size of map is : " + identityHashMap.size());
		System.out.println("Here \"a\" and new String(\"a\") are considered as separate keys");

	}

}
