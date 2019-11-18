package Day5;

public class Manager extends Employee{
	
	String [] manages;
	
	public Manager(String name, int age, int salary, String department, String[] manages) {
		super(name, age, salary, department);
		this.manages = manages;
	}
	

	public String[] getManages() {
		return manages;
	}


	public void setManages(String[] manages) {
		this.manages = manages;
	}


	public void printWhoThisPersonManages() {
		for (String emp: manages) {
			System.out.println(emp);
		}
	}
}
