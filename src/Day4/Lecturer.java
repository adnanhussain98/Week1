package Day4;

public class Lecturer extends Person {

	private float salary;
	
	public Lecturer(String name, int birthYear, String homeTown) {
		super(name, birthYear, homeTown);
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	
}
