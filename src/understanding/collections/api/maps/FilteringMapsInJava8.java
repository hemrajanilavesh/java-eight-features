package understanding.collections.api.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilteringMapsInJava8 {

	public static void main(String[] args) {

		Map<String, Integer> unfilteredMap = new HashMap<String, Integer>();
		unfilteredMap.put("z", 10);
		unfilteredMap.put("b", 5);
		unfilteredMap.put("d", 1);
		unfilteredMap.put("e", 7);
		unfilteredMap.put("y", 8);
		unfilteredMap.put("n", 99);
		unfilteredMap.put("a", 6);
		unfilteredMap.put("c", 20);
		unfilteredMap.put("g", 50);
		unfilteredMap.put("m", 2);
		unfilteredMap.put("x", 3);
		unfilteredMap.put("f", 9);

		System.out.println("Original Map:");
		System.out.println(unfilteredMap);

		/*
		 * Joining all keys of a map String result =
		 * unfilteredMap.keySet().stream().filter(x ->
		 * !x.equals("x")).collect(Collectors.joining()); System.out.println(result);
		 */

		// hard-coded filter condition
		Map<String, Integer> filterMap = unfilteredMap.entrySet().stream().filter(x -> x.getValue() >= 10)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("Filtered Map:");
		System.out.println(filterMap);
		
		
		// generic filter condition
		filterMap = filterMapByValue(unfilteredMap, x -> x > 5);
		System.out.println("Filtered Map:  x -> x > 5");
		System.out.println(filterMap);
		
		filterMap = filterMapByValue(unfilteredMap, x -> x < 15);
		System.out.println("Filtered Map:  x -> x < 15");
		System.out.println(filterMap);
		
	}
	
	
	public static <K, V> Map<K, V> filterMapByValue(Map<K, V> unfilterMap, Predicate<V> predicate) {
		return unfilterMap.entrySet().stream().filter(mapEntry -> predicate.test(mapEntry.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	}
	

}
