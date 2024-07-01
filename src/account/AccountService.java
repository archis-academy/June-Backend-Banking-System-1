package account;

import user.User;
import user.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    List<Account> accountList = new ArrayList<>();
    final int index = 1;
    final UserService userService;

    public AccountService(UserService userService) {
        this.userService = userService;
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
            System.out.println("User acoount has been created succesfully.");
        }
    }
}
