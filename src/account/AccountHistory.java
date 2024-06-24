package account;

import java.time.LocalDate;

public class AccountHistory {
	public String transactionType; // deposit -> true, withdrawal -> false
	public boolean isSuccessful;
	public double amount;
	public String location;
	public LocalDate date;
	public int senderId;
	public int receiverId;
	
	public AccountHistory(){

	}

	public AccountHistory(String transactionType, boolean isSuccessful, double amount, String location, LocalDate date, int senderId, int receiverId) {
		this.transactionType = transactionType;
		this.isSuccessful = isSuccessful;
		this.amount = amount;
		this.location = location;
		this.date = date;
		this.senderId = senderId;
		this.receiverId = receiverId;
	}
}
