
public class Employee {
	private String name;
	private String salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Employee(String name,String splitted) {
		this.name = name;
		this.salary = splitted;
	}
}
