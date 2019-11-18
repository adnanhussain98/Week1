package Day5;

public class Recap {

	public static void main(String[] args) {

		String[] people = {"Kaleem", "Saffiyah", "Mo"};
		Employee e = new Employee("Adnan", 21, 100000, "Computing");
		Manager m = new Manager("Kaleem", 30, 500, "HR", people);
		
		//calls the printDetails method
		m.printDetails();
		
		m.printWhoThisPersonManages();
		
	}

}
