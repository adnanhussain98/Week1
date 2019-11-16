package Day3;

public class CalculatorController {

	public static void main(String[] args) {

		// creates new instance of Calculator class
		Calculator newCalc = new Calculator();

		// prints out the calculations by calling to the method
		System.out.println(newCalc.Add(2, 2));
		System.out.println(newCalc.Subtract(2, 2));
		System.out.println(newCalc.Multiply(2, 2));
		System.out.println(newCalc.Divide(2, 2));

		// object points to allCalc method which takes int, int, string as constructor.
		// user can use the following operators, +, -, *, /
		System.out.println(newCalc.allCalc(5, 5, "*"));
	}

}
