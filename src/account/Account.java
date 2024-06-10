package account;

import user.User;

public class Account {
	public int accountNumber;
	public String accountHoldersName;
	public double accountBalance;
	public User user;

	public Account(){

	}

	public Account(int accountNumber, String accountHoldersName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHoldersName = accountHoldersName;
		this.accountBalance = accountBalance;
	}
}
