package services;

import models.User;

import java.util.ArrayList;

public class UserService {
    private User user;

    public UserService() {
        user = new User();
    }

    public void addUser(User user) {
        User.getListUser().add(user);
    }

    public void removeUser(int id) {
        ArrayList<User> listUser = User.getListUser();
        for (int i = 0; i < listUser.size(); i++) {
            if (id == User.getListUser().get(i).getId()) {
                User.getListUser().remove(User.getListUser().get(i));
            }
        }
    }
}
