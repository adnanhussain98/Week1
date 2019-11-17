package Day3;

import java.util.HashMap;
import java.util.ArrayList;

public class Controller {

	public static void main(String[] args) {

		// declare collection HashMap
		// Then declare two data types for key and value. e.g. Integer, String
		// students is the HashMap name. It is the object of the HashMap
		// can't write short hand for type, e.g. Integer not int.
		HashMap<Integer, String> students = new HashMap<Integer, String>();

		// adds data to HashMap
		students.put(15066618, "Mo");
		students.put(16024003, "Iqra");
		students.put(16028929, "Adnan");
		students.put(15074981, "Saffiah");
		students.put(14059504, "Aya");

		System.out.println(students.get(16028929));

		// using the same id number overwrites existing person
		students.put(16028929, "John");
		System.out.println(students.get(16028929));

		// this checks if the HashMap contains an ID number and returns true or false
		System.out.println(students.containsKey(16028929)); // true

		MapsAndArrays x = new MapsAndArrays();
		x.countChars("Hello World");

		String testString = "The quick brown fox jumps over the lazy dog";
		HashMap<Character, Integer> theMap = x.countChars(testString);

		// iterates of the HashMap and prints all of its contents.
		theMap.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});

		// HashMap to store car. Number plate is alphanumeric so it is a String.
		HashMap<String, String> cars = new HashMap<>();
		// adds car data to the HashMap
		cars.put("AB123", "Mercedes");
		cars.put("AB345", "BMW");
		cars.put("AB678", "Lamborghini");

		System.out.println(cars.get("AB678"));

		// Array lists. Fruits is an object of ArrayList
		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Strawberry");
		fruits.add("Tomato");
		fruits.add("Cucumber");
		fruits.add("Pineapple");

		// removes Strawberry from array
//		fruits.remove(0);

		// prints size of the array
		System.out.println(fruits.size());
	}

}
