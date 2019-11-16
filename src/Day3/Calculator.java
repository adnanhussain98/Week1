package Day3;

public class Calculator {

	public int Add(int num1, int num2) {

		return num1 + num2;
	}

	public int Subtract(int num1, int num2) {

		return num1 - num2;
	}

	public int Multiply(int num1, int num2) {

		return num1 * num2;
	}

	public int Divide(int num1, int num2) {

		return num1 / num2;
	}

	public int allCalc(int num1, int num2, String op) {

		if (op == "+") {
			return num1 + num2;
		} else if (op == "-") {
			return num1 - num2;
		} else if (op == "*") {
			return num1 * num2;
		} else {
			return num1 / num2;
		}
	}

}
