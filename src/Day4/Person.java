package Day4;

import java.time.LocalDate;

public abstract class Person {

	private String name;
	private int birthYear;
	private String homeTown;

	// constructors are used to set up the objects instance variables.
	// constructor is a method that is the same name as the class.
	public Person(String name, int birthYear, String homeTown) {

		// initialises variable and refers to the object
		this.name = name;
		this.birthYear = birthYear;
		this.homeTown = homeTown;

	}

	public Person(String name) {

		// initialises variable and refers to the object
		this.name = name;

	}

	// creating method to print out name, birth year, hometown + description
	// no constructor as we are printing the instance variables.
	public void introduceYourself() {
		System.out.println(
				// concatenated strings and variable names
				"My name is " + this.name + ", I am from " + this.homeTown + ". I was born in " + this.birthYear
						+ " I am " + calculateAge() + " years old");
	}

	// private function as it is used in the same class. It is not needed in any
	// other class.
	private int calculateAge() {
		return LocalDate.now().getYear() - this.birthYear;
	}

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

}
