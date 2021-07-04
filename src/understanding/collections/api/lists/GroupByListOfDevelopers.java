package understanding.collections.api.lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByListOfDevelopers {

	public static void main(String[] args) {
		// group by skill set or get java developer count
		
		List<Developer> devList = getDevelopers();
		
		// map of skill set -> total salary spent on all resources
		// e.g. Java = Sum of Salaries of all java resources
		Map<String, Integer> groupedDevs = devList.stream()
				.collect(Collectors.groupingBy(Developer::getSkillSet, Collectors.summingInt(d -> d.getSalary().intValue())));
		
		System.out.println(groupedDevs);
		
		Map<String, Long> countDevs = devList.stream().collect(Collectors.groupingBy(Developer::getSkillSet, Collectors.counting()));
		
		System.out.println(countDevs);

	}
	
	public static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33, "Java"));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20, "UI"));
		result.add(new Developer("mkyong", new BigDecimal("100000"), 10, "SQL"));
		result.add(new Developer("iris", new BigDecimal("170000"), 55, "Java"));
		result.add(new Developer("alvin-ui", new BigDecimal("80000"), 20, "UI"));
		result.add(new Developer("mkyong-SQL", new BigDecimal("100000"), 10, "SQL"));
		result.add(new Developer("iris-java", new BigDecimal("170000"), 55, "Java"));
		
		return result;

	}

}
