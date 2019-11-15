package Day1;

public class Methods {

	public static void main(String[] args) {

		int[] myNumbers = { 1, 2, 3, 4, 5, 6 };

		int x = addTwoNumbers(10, 10);
		System.out.println(x);

		int m = multiplyTwoNumbers(5, 5);
		System.out.println(m);

		int d = divideTwoNumbers(4, 2);
		System.out.println(d);

		String hi = sayHello("adnan", 21);
		System.out.println(hi);

		System.out.println(totalOfArray(myNumbers));
		System.out.println(averageOfArray(myNumbers));

	}

	// static loads method memory straight away
	// void = return type, doesn't return anything
	// addTwoNumbers = function name
	// (int num1, int num2) = argument
	// int returns an integer
	private static int addTwoNumbers(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}

	private static int multiplyTwoNumbers(int num1, int num2) {
		return num1 * num2;
	}

	private static int divideTwoNumbers(int num1, int num2) {
		return num1 / num2;
	}

	private static String sayHello(String name, int age) {
		String hi = "Hi " + name + " you are " + age + " years old";
		return hi;
	}

	// pass an in array as an argument
	// total all the ints in the array
	// return the total
	private static int totalOfArray(int[] numbers) {

		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			counter = counter + numbers[i];
		}

		return counter;
	}

	private static int averageOfArray(int[] numbers) {

		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			counter = counter + numbers[i];
		}
		return counter / numbers.length;
	}

	private void highestNumber(int[] adnan) {

		int highestNumber = 0;
		for (int i = 0; i < adnan.length; i++) {
			if (adnan[i] > highestNumber) {
				highestNumber = adnan[i];
			}
		}
		System.out.println(highestNumber);
	}
}
