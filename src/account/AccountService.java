package account;

import user.User;
import user.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    List<Account> accountList;
    final int index = 1;
    final UserService userService;

    public AccountService(UserService userService) {
        this.userService = userService;
        this.accountList = new ArrayList<>();
    }

    public void createAccount(int userId, String accountType) {
        Account account = new Account();
        account.accountNumber = 0;
        account.accountType = accountType;
        account.createdDate = LocalDate.now();
        User user = userService.getUserById(userId);
        if (user != null) {
            account.user = user;
            accountList.add(account);
            System.out.println("User account has been created succesfully.");
        }
    }

    public void deleteAccountById(int accountNumber) {
        accountList.removeIf(account -> account.accountNumber == accountNumber);
        System.out.println("Account has been deleted");
    }

    public void getAllAccounts() {
        for (Account account : accountList) {
            System.out.println("Account Holders Name : " + account.accountHoldersName);
            System.out.println("Account Number : " + account.accountNumber);
            System.out.println("Account Balance : " + account.accountBalance);
            System.out.println("Account Type : " + account.accountType);
        }
    }

    public Account getByAccountNumber(int accountNumber) {
        for (Account account : accountList) {
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void deposite(double amount, int accountNumber) {
        Account account = getByAccountNumber(accountNumber);
        account.accountBalance += amount;
    }

    public void checkBalance(int accountNumber) {
        Account account = getByAccountNumber(accountNumber);
        System.out.println("Your Balance : " + account.accountBalance);

    }
}

