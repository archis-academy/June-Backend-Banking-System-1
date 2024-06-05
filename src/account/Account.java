package account;

public class Account {
	public int accountNumber;
	public String accountHoldersName;
	public double accountBalance;
	
	public Account(int accountNumber, String accountHoldersName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHoldersName = accountHoldersName;
		this.accountBalance = accountBalance;
	}
}
