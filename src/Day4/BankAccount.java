package Day4;

public class BankAccount {

	private float balance;
	private String name;

	public BankAccount(float balance, String name) {

		this.balance = balance;
		this.name = name;
	}

	public BankAccount() {

		this.name = "unknown";
		this.balance = 0;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposit(float amount) {
		this.balance = this.balance += amount;
		//shows balance once user has deposited money
		System.out.println("Thank you, your new balance is " + this.balance);
	}

	public void withdraw(float amount) {
				
			if (checkValidWithdraw(amount)) {
			this.balance -= amount;
			System.out.println("Thank you, your new balance is " + this.balance);
		}else {
			System.out.println("broke bitch");
		}
	}

	private boolean checkValidWithdraw(float amount) {

//		if (amount < this.balance) {
//			return true;
//		} else {
//			return false;
//		}
		
		return amount <= this.balance;
	}

}
