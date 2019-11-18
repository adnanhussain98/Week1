package Day5;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import Day3.Person;

public class BankController {

	public static void main(String[] args) {

		// initialises bankUtils class
		BankUtils utils = new BankUtils();
		//
		utils.loadBankAccount();
		HashMap<Integer, BankAccount> bankOfAdnan = utils.loadBankAccount();
		// creating a hashmap that takes Integer for account number and BankAccount
		// object for balance and name
		// initialise scanner
		Scanner sc = new Scanner(System.in);

		while (true) {

			// Welcome message and prompt for user
			System.out.println("Welcome to the Bank Of Adnan");
			System.out.println("1 = enter account number");
			System.out.println("2 = create new account");
			// user input
			int choice = sc.nextInt();
			sc.nextLine();

			// executes code block for entering account
			if (choice == 1) {

				// 1 for account num
				// 2 for new account

				// enables user to enter accNo. this uses the accNo object
				int accNo = sc.nextInt();
				sc.nextLine();

				// enters account if user enters an account number in HashMap
				if (bankOfAdnan.containsKey(accNo)) {
					// name the while loop so we can break out of it when we're done
					bankLoop: while (true) {

						// gets account name by accessing variable through the account object
						BankAccount account = bankOfAdnan.get(accNo);
						// prints welcome message with the account holders name
						System.out.println("Hi there " + account.getName());
						// prints out the options menu
						System.out.println("d = deposit");
						System.out.println("w = withdraw");
						System.out.println("e = exit");
						// allows user to type character
						String option = sc.nextLine();
						// initialising the amount to 0
						float amount = 0;

						// switch statement as we know the options
						switch (option) {
						case "d":
							System.out.println("How much would you like to deposit?");
							amount = sc.nextFloat();
							sc.nextLine();
							account.deposit(amount);
							break;
						case "w":
							System.out.println("How much would you like to withdraw?");
							amount = sc.nextFloat();
							account.withdraw(amount);
							break;
						case "e":

							break bankLoop; // label loop to break the while function

						default:
							System.out.println("This option is not supported.");
							break;
						}
					}

				} else {
					System.out.println("The account number" + accNo + "is invalid");
				}
			} else if (choice == 2) {
				System.out.println("What is your name?");
				String enterName = sc.nextLine();
				System.out.println("How much do you want to deposit?");
				int deposit = sc.nextInt();
				sc.nextLine(); // this is needed for ints and floats
				Random rnd = new Random();
				int generateAccNo = rnd.nextInt(899) + 100;
				bankOfAdnan.put(generateAccNo, new BankAccount(deposit, enterName));
				utils.saveBankAccounts(bankOfAdnan);

			} else {
				System.out.println("This is not an option");
			}
		}
	}

}
