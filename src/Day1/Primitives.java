package Day1;

public class Primitives {

	public static void main(String[] args) {

		String fName = "Adnan"; // string is an array of single characters
		String sName = "Hussain";
		int age = 21;
		boolean earnOver25K = true;
		float height = 5.10f;
		char gender = 'm';

		int addition = 2 + 2;
		int subtraction = 2 - 2;
		int division = 2 / 2;
		int multiplication = 2 * 2;
		//modulo calculates the remainder 
		int modulo = 50 % 11;

		// option up/down moves line up/down
		// cmd option down = copies line up or down
		// sysout control space = system.out.println() shortcut
		// command, shift F sorts indentation

		System.out.println(addition);
		System.out.println(subtraction);
		System.out.println(division);
		System.out.println(multiplication);
		System.out.println(modulo);

		// string concatenation
		System.out.println("Add: " + addition + " Subtract: " + subtraction + " Division: " + division
				+ " Multiplication: " + multiplication + " Modulo: " + modulo);
	}

}
