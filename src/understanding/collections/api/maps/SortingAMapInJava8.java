package understanding.collections.api.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingAMapInJava8 {

	public static void main(String[] args) {
		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("g", 50);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("m", 2);
		unsortMap.put("x", 3);
		unsortMap.put("f", 9);

		System.out.println("Original Map:");
		System.out.println(unsortMap);

		LinkedHashMap<String, Integer> sortedByKeyMap = new LinkedHashMap<String, Integer>(unsortMap.size());
		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(e -> sortedByKeyMap.put(e.getKey(), e.getValue()));

		System.out.println("Sorted By Key Map:");
		System.out.println(sortedByKeyMap);
		
		LinkedHashMap<String, Integer> sortedByValueMap = new LinkedHashMap<String, Integer>(unsortMap.size());
		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(e -> sortedByValueMap.put(e.getKey(), e.getValue()));

		System.out.println("Sorted By Value Map:");
		System.out.println(sortedByValueMap);

	}

}
