package Day1;
import java.util.Scanner;

public class TotalOfNumbers {

	public static void main(String[] args) {

		// holds number entered by user
		int num = 0;
		int total = 0;

		// scanner takes input from user
		Scanner sc = new Scanner(System.in);

		// puts entered number into num variable
		while (num != -999) {

			System.out.println("Enter a number");
			num = sc.nextInt();

			if (num != -999)
				total += num;
		}

		System.out.println(total);
	}

}
