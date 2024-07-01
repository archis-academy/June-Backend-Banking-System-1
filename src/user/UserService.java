package user;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    List<User> userList = new ArrayList<>();

    public User getUserById(int id) {
        for (User user : userList) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }
}
