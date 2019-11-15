package Day2;

public class Recap {

	public static void main(String[] args) {

		// initialise food array
		String[] foodIAteToday = { "coffee", "banana", "tuna sandwich" };

		// for loop calculates length of array and increments it. this itterates over
		// the array and prints it
		for (int i = 0; i < foodIAteToday.length; i++) {
			System.out.println(foodIAteToday[i]);
		}

		// prints 1 - 100, starts at index 0 and and goes up until 100 and prints index
		for (int i = 0; i < 100; i++) {
			System.out.println(i++);
		}

		// prints 100 - 0, i-- decrements and prints all numbers
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}

		// enhanced for loop. initilaise the type, e.g. String f and then array name.
		// then print array
		for (String f : foodIAteToday) {
			System.out.println(f);
		}

		// print position of banana
		for (int i = 0; i < foodIAteToday.length; i++) {
			if (foodIAteToday[i].toLowerCase().equals("banana")) {
				System.out.println("found at index: " + i);
			}
		}

		// call to sayHello method
		sayHello("Adnan");
		
		String answer = nameAndBirthYear("adnan", 1998);

	}

	//
	private static int mutn(int num1, int num2) {
		return num1 * num2;
	}

	// method to say hi to the given name
	private static void sayHello(String name) {
		System.out.println("Hi there " + name);
	}
	
	private static String nameAndBirthYear(String name, int birthYear) {
		
		//calculates age using birth year
		int age = 2019 - birthYear;
		return "Hi " + name + " You are " + age + " years old.";
	}
}
