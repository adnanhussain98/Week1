package Day3;

import java.util.ArrayList;

public class ControllerVehicle {

	public static void main(String[] args) {

		Vehicle moVehicle = new Vehicle("BMW", "red", 1985);
		Vehicle azVehicle = new Vehicle("Volvo", "Blue", 2012);
		
//		System.out.println(moVehicle.getMake());
//		System.out.println(azVehicle.getMake() + " " + azVehicle.getColour());
		
		//creates array list for vehicle class. Vecs is an object of the vehicle class.
		ArrayList<Vehicle> vecs = new ArrayList<>();
		//adds vehicle to the array list
		vecs.add(moVehicle);
		vecs.add(azVehicle);
		//gets the vehicle make from vecs object 
		System.out.println(vecs.get(0).getMake());
		System.out.println(vecs.get(1).getMake());
	}

}
