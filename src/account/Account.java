package account;

import java.time.LocalDate;
import java.util.ArrayList;

import user.User;

public class Account {
	public int accountNumber;
	public String accountHoldersName;
	public double accountBalance;
	public String accountType;
	public ArrayList<AccountHistory> accountHistories;
	public LocalDate createdDate;
	public User user;

	public Account(){

	}

	public Account(int accountNumber, String accountHoldersName, double accountBalance, String accountType) {
		this.accountNumber = accountNumber;
		this.accountHoldersName = accountHoldersName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
}
