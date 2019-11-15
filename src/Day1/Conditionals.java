package Day1;

public class Conditionals {

	public static void main(String[] args) {

		int age = 21;

		//if statement
		if(age > 18) {
			System.out.println("You are an adult");
		} 
		
		if (age == 21) {
			System.out.println("You are awesome");
		} 
		
		if (age % 2 == 0) {
			System.out.println("Your age is an even number");
		}
		
		else {
			System.out.println("You're a kid");
		}

		// range of numbers in if statement
		if (age >= 18 && age <= 25) {
			System.out.println("cool");
		}

		// use switch statements when you know the value of the condition
		switch (age) {
		case 18:
		case 19: // stack case statements for more than one case
			System.out.println("You are an adult");
			break;

		case 5:
			System.out.println("You're still a baby");
			break;

		default:
			System.out.println("No one cares");
			break;
		}
	}

}
