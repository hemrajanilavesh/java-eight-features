package understanding.collections.api.lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class SortingListUsingLambdas {

	public static void main(String[] args) {
		List<Developer> listDevs = getDevelopers();
		
		System.out.println("Before Sort");
		listDevs.forEach(System.out::println);

		// sort first by name, then by salary, then by age

		listDevs.sort((d1, d2) -> {
			if (!d1.getName().equals(d2.getName())) {
				return d1.getName().compareTo(d2.getName());
			} else {
				if (!d1.getSalary().equals(d2.getSalary())) {
					return d1.getSalary().compareTo(d2.getSalary());
				} else {
					return d1.getAge() - d2.getAge();
				}
			}
		});
		
		System.out.println("After Sort");
		listDevs.forEach(System.out::println);

		List<Developer> developers = getDevelopers();
		System.out.println("Before Sort");
		developers.forEach(System.out::println);

		// sort first by name, then by salary, then by age
		developers.sort(Comparator.comparing(Developer::getName).thenComparing(Developer::getSalary).thenComparing(Developer::getAge));
		System.out.println("After Sort");
		developers.forEach(System.out::println);
	}

	public static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("mkyong", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		return result;

	}

}
