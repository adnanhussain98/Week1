package Day3;

public class Vehicle {

	// private methods as it should only be accessible to this class.
	//instance variables
	private String make;
	private int year;
	private String colour;

	// each object created gets set up through the constructor
	public Vehicle(String make, String colour, int year) {

		// this refers to the instance variable, e.g. this.make refers to private String make
		// this.make refers to the instance variable.
		// make; refers to the argument variable
		this.make = make;
		this.colour = colour;
		this.year = year;
	}

	// getters and setters will let you access the instance variables (private methods) of a class.
	// encapsulation controls the access of the instance variables
	// getters allow you to get the variable name
	// setters will allow you to set a new variable name

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}
}
