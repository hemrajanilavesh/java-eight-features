package understanding.collectors.model;

import java.math.BigDecimal;

public class Developer {

	private String name;
	private BigDecimal salary;
	private int age;
	private String skillSet;

	public Developer(String name, BigDecimal salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.skillSet = "ProdSupport";
	}

	public Developer(String name, BigDecimal salary, int age, String skillSet) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.skillSet = skillSet;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public String getSkillSet() {
		return skillSet;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + ", skillSet=" + skillSet + "]";
	}

}
