import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// new = instantiating a new object
		Scanner sc = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = sc.nextInt();// nextInt for numbers
		System.out.println("Thanks, you are: " + age);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Where are you from?");
		String from = sc2.nextLine();//nextLine for String
		System.out.println("You are from " + from);
	}

}
