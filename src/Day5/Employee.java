package Day5;

public class Employee extends Person {

	private float salary;
	private String department;

	public Employee(String name, int age, float salary, String department) {
		// this needs to take the name and age so super is needed.
		super(name, age);
		this.salary = salary;
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	// toString
	public String toString() {
		return this.getName() + " earns " + this.getSalary();
	}
	
	public void printDetails() {
		System.out.println(this.getName());
	}

}
