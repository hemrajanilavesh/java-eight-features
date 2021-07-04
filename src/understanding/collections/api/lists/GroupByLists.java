package understanding.collections.api.lists;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByLists {

	public static void main(String[] args) {
		
		List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");
		
		Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		result.entrySet().forEach(System.out::println);
		
		System.out.println(System.lineSeparator());
		
		// order the output based on occurences
		
		Map<String, Long> sortedResult = new LinkedHashMap<String, Long>();
		
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e -> sortedResult.put(e.getKey(), e.getValue()));
		
		sortedResult.entrySet().forEach(System.out::println);

	}

}
