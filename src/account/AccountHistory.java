package account;

import java.time.LocalDate;

public class AccountHistory {
	public boolean transaction; // deposit -> true, withdrawal -> false
	public boolean isSuccessful;
	public double amount;
	public String location;
	public LocalDate date;
	public LocalDate clock;
	
	public AccountHistory(boolean transaction, boolean isSuccessful, double amount, String location, LocalDate date, LocalDate clock) {
		this.transaction = transaction;
		this.isSuccessful = isSuccessful;
		this.amount = amount;
		this.location = location;
		this.date = date;
		this.clock = clock;
	}
	
}
