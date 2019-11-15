package Day1;
import java.util.Scanner;  // Import the Scanner class
public class Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("You are " + name);
		
		if (name == "Adnan") {
			
			System.out.println("Well done");
		} else {
			System.out.println("ur gay");
		}
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = sc2.nextInt();
		System.out.println("You are " + age + " years old.");
		
		
		

	}

}
