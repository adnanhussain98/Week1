package Day4;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import Day3.Person;

public class BankController {

	public static void main(String[] args) {

//		BankAccount mo = new BankAccount(5, "Mo");
//		
//		System.out.println(mo.getBalance());
//		mo.deposit(100.49f);
//		System.out.println("New Balance " + mo.getBalance());
//		mo.withdraw(12.99f);
//		System.out.println("New Balance " + mo.getBalance());
//		mo.withdraw(92.6f);
//		System.out.println("New Balance " + mo.getBalance());

		// creating a hashmap that takes Integer for account number and BankAccount
		// object for balance and name
		HashMap<Integer, BankAccount> bankOfAdnan = new HashMap<>();
		// initialise scanner
		Scanner sc = new Scanner(System.in);		

		// creating bank accounts using the constructors
		bankOfAdnan.put(123, new BankAccount(999999, "adnan"));
		bankOfAdnan.put(321, new BankAccount(5, "kaleem"));
		bankOfAdnan.put(231, new BankAccount(456, "mo"));
		bankOfAdnan.put(789, new BankAccount(85768, "iqra"));
		bankOfAdnan.put(678, new BankAccount(42, "saffiyah"));
		

		while (true) {

			// Welcome message and prompt for user
			System.out.println("Welcome to the Bank Of Adnan");
			System.out.println("1 = enter account number");
			System.out.println("2 = create new account");
			// user input
			int choice = sc.nextInt();
			sc.hasNextLine();

			//executes code block for entering account
			if (choice == 1) {

				// 1 for account num
				// 2 for new account

				// enables user to enter accNo. this uses the accNo object
				int accNo = sc.nextInt();
				sc.nextLine();

				//enters account if user enters an account number in HashMap
				if (bankOfAdnan.containsKey(accNo)) {
					// name the while loop so we can break out of it when we're done
					bankLoop: while (true) {

						//gets account name by accessing variable through the account object
						BankAccount account = bankOfAdnan.get(accNo);
						//prints welcome message with the account holders name
						System.out.println("Hi there " + account.getName());
						//prints out the options menu
						System.out.println("d = deposit");
						System.out.println("w = withdraw");
						System.out.println("e = exit");
						//allows user to type character
						String option = sc.nextLine();
						//initialising the amount to 0
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
			}else if (choice ==2){
				System.out.println("What is your name?");
				String enterName = sc.nextLine();
				System.out.println("How much do you want to deposit?");
				int deposit = sc.nextInt();
				sc.nextLine(); //this is needed for ints and floats
				Random rnd = new Random();
				int generateAccNo = rnd.nextInt(899)+100; 
				bankOfAdnan.put(generateAccNo, new BankAccount(deposit, enterName));

			}
			else {
				System.out.println("This is not an option");
			}
		}
	}

}
