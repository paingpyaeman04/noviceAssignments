package novice.assignments2.bankaccount;

public class Account {
	private int accountNumber;
	private double balance;

	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}

	public void credit(double amount) {
		this.balance += amount;
	}

	public void debit(double amount) {
		if (this.balance < amount)
			System.out.println("Amount withdrawn exceeds the current balance");
		else
			this.balance -= amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "A/C no: " + this.accountNumber + "\tBalance = $" + Math.round(this.balance * 100.0)/100.0;
	}

}
