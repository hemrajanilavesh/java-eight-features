package understanding.lambdas.basics;

import java.util.Date;
import java.util.Objects;

public class Employee implements Comparable {

    private String firstName;
    private String lastName;
    private int employeeId;
    private Date joiningDate;
    private Float salary;

    public Employee(String firstName, String lastName, int employeeId, Date joiningDate, Float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public Float getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (employeeId != employee.employeeId) return false;
        if (!Objects.equals(firstName, employee.firstName)) return false;
        if (!Objects.equals(lastName, employee.lastName)) return false;
        if (!Objects.equals(joiningDate, employee.joiningDate))
            return false;
        return Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + employeeId;
        result = 31 * result + (joiningDate != null ? joiningDate.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        // ascending order of employeeID
        if (this.employeeId < other.employeeId) {
            return -1;
        } else if (this.employeeId > other.employeeId) {
            return 1;
        }
        // ascending order of firstName
        if (this.firstName != null && this.firstName.compareTo(other.firstName) != 0) {
            return this.firstName.compareTo(other.firstName);
        }
        // ascending order of lastName
        if (this.lastName != null && this.lastName.compareTo(other.lastName) != 0) {
            return this.firstName.compareTo(other.firstName);
        }
        // ascending order of joiningDate
        if (this.joiningDate != null && this.joiningDate.compareTo(other.joiningDate) != 0) {
            return this.joiningDate.compareTo(other.joiningDate);
        }
        // ascending order of salary
        return this.salary.compareTo(other.getSalary());
    }

}
