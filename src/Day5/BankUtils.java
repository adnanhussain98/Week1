package Day5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankUtils {

	// hashmap to store the bank account objects associated with a (int) key which
	// is bank account objects
	public HashMap<Integer, BankAccount> loadBankAccount() {

		// new HashMap to store the details
		HashMap<Integer, BankAccount> accounts = new HashMap();

		try {
			// scanner to read the accounts text file
			Scanner sc = new Scanner(new File("accounts.txt"));

			while (sc.hasNextLine()) {
				// read each line of the accounts file one by one and store it in the
				// accountInfo String variable
				String accountInfo = sc.nextLine();

				// splitting the accountInfo string by the comma and stores the results in thje
				// details array.
				String[] details = accountInfo.split(",");
				// cast the first position of the details string array to a int for the account
				// number
				int accNo = Integer.valueOf(details[0]);
				// cast the second position of the details string array to a float for the
				// balance
				float balance = Float.valueOf(details[1]);
				// stores name in index 2 (name)
				String name = details[2];

				System.out.println(details[0]);
				System.out.println(details[1]);
				System.out.println(details[2]);
				System.out.println("##################");

				// uses above 3 variables to create a bank account object and put/add it to the
				accounts.put(accNo, new BankAccount(balance, name));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// return the populated hashmap containing all the bank account objects
		return accounts;
	}

	public void saveBankAccounts(HashMap<Integer, BankAccount> accounts) {

		// write the accounts in the hashmap to the accounts.txt file
		String data = "";

		// enhanced for loop to get into the account
		for (Map.Entry<Integer, BankAccount> account : accounts.entrySet()) {
			data += account.getKey() + "," + account.getValue().getBalance() + "," + account.getValue().getName()
					+ "\n";
		}

		try {
			// create file
			File f = new File("accounts.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("File Saved!");
	}

}
