package understanding.collections.api.lists;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringLists {

	public static void main(String[] args) {
		List<Developer> listDevs = SortingListUsingLambdas.getDevelopers();
		listDevs.forEach(System.out::println);

		System.out.println(System.lineSeparator());

		final BigDecimal bd = new BigDecimal(90000);

		// filter developers with age greater than 25 and salary greater than 90K
		Optional<String> name = listDevs.stream().filter(dev -> {
			return dev.getAge() > 25 && dev.getSalary().compareTo(bd) > 0;
		}).map(Developer::getName).findFirst();

		if (name.isPresent()) {
			System.out.println(name.get());
		}

		System.out.println(System.lineSeparator());

		// remove devs with name as mkyong
		listDevs.stream().filter(dev -> !"mkyong".equals(dev.getName())).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println(System.lineSeparator());

		Developer developer = listDevs.stream().filter(dev -> "alvin".equals(dev.getName())) // filter by name, it
																								// should be alvin
				.findAny() // return if found any
				.orElse(null); // else return null

		if (developer != null) {
			System.out.println(developer);
		}

		// get names of developers with age greater than 25

		listDevs.stream().filter(dev -> dev.getAge() > 25).map(Developer::getName).collect(Collectors.toList())
				.forEach(System.out::println);

		// convert names of each developer to uppercase

		listDevs.stream().map(Developer::getName).map(String::toUpperCase).collect(Collectors.toList())
				.forEach(System.out::println);
		
		
		// filter out non null elements from a stream
		Stream<String> languages = Stream.of("Java", null, "Python", null, "SQL", null, "JavaScript");
		
		languages.filter(Objects::nonNull).collect(Collectors.toList()).forEach(System.out::println);
		

	}

}
