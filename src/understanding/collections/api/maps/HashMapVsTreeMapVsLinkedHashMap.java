package understanding.collections.api.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* Java program to print differences of  HashMap ,TreeMap & LinkedHashMap*/
public class HashMapVsTreeMapVsLinkedHashMap {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 5, 10, 6, 5, 10, 7, 5 };
		HashMap<Integer, Integer> hMap = new HashMap<>(5);
		hMap = (HashMap<Integer, Integer>) fillMap(hMap, intArr);
		hMap.put(null, null);
		System.out.println("Display Frequency of Numbers in an Array using HashMap.");
		System.out.println("HashMap does not maintain any order.");
		System.out.println("HashMap allows null values and null keys.");
		printMapContent(hMap);

		TreeMap<Integer, Integer> trMap = new TreeMap<>();
		trMap = (TreeMap<Integer, Integer>) fillMap(trMap, intArr);
		System.out.println("Display Frequency of Numbers in an Array using TreeMap.");
		System.out.println("TreeMap maintains the natural ordering of its Keys.");
		System.out.println("TreeMap does not allow Null Keys. But Null values are allowed.");
		printMapContent(trMap);
		// trMap.put(null, null); // not allowed

		LinkedHashMap<Integer, Integer> lHMap = new LinkedHashMap<>(5);
		lHMap = (LinkedHashMap<Integer, Integer>) fillMap(lHMap, intArr);
		lHMap.put(null, null);
		System.out.println("Display Frequency of Numbers in an Array using LinkedHashMap.");
		System.out.println("LinkedHashMap maintains the insertion ordering of its Keys.");
		System.out.println("LinkedHashMap allows null values and null keys.");
		printMapContent(lHMap);
	}

	private static Map<Integer, Integer> fillMap(Map<Integer, Integer> map, Integer[] intArr) {
		for (Integer i : intArr) {
			if (map.containsKey(i)) {
				Integer frequency = map.get(i);
				frequency += 1;
				map.put(i, frequency);
			} else {
				map.put(i, 1);
			}
		}
		return map;
	}

	private static void printMapContent(Map<Integer, Integer> map) {
		map.forEach(HashMapVsTreeMapVsLinkedHashMap::print);
		System.out.println(System.lineSeparator());
	}
	
	private static void print(Integer i1, Integer i2) {
		System.out.println("Key -> " + i1 + ", Value -> " + i2);
	}

}
