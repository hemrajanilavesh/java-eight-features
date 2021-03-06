package understanding.collections.api.maps;

import java.util.HashMap;
import java.util.Map;

public class MergingMapsInJava {

	private static Map<String, Employee> map1 = new HashMap<>();
	private static Map<String, Employee> map2 = new HashMap<>();

	public static void main(String[] args) {
		initialize();
		mergeFunction();

	}

	private static void initialize() {
		Employee employee1 = new Employee(1L, "Henry");
		map1.put(employee1.getName(), employee1);
		Employee employee2 = new Employee(22L, "Annie");
		map1.put(employee2.getName(), employee2);
		Employee employee3 = new Employee(8L, "John");
		map1.put(employee3.getName(), employee3);

		Employee employee4 = new Employee(2L, "George");
		map2.put(employee4.getName(), employee4);
		Employee employee5 = new Employee(3L, "Henry");
		map2.put(employee5.getName(), employee5);
	}

	private static void mergeFunction() {
		Map<String, Employee> map3 = new HashMap<String, Employee>(map1);
		
		map2.forEach((key, value) -> {
			map3.merge(key, value, (v1, v2)-> 
				new Employee(v1.getId(), v2.getName()));
		});
		
		map3.entrySet().forEach(System.out::println);
		
	}

}

class Employee {

	private Long id;
	private String name;

	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
