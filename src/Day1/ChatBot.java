package Day1;
import java.util.Scanner;
import java.util.Random;

public class ChatBot {

	public static void main(String[] args) {

		String[] questions = { "How are you", "Where are you from", "Where do you work?",
				"How many siblings do you have", "Are you in the UK?" };
		Random rnd = new Random();

		int num = rnd.nextInt(questions.length);
		System.out.println(questions[num]);

		// scanner takes the users answer
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();

		// while loop
		while (!answer.equals("bye")) { // strings are objects not primitives. cannot use !=
			num = rnd.nextInt(questions.length);
			System.out.println(questions[num]);

			sc = new Scanner(System.in);
			answer = sc.nextLine();
		}

		// keep asking the user random questions until user types "bye"

	}

}
