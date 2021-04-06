package com.adrianlearning.com.adrianlearning.OOP.LOL;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> getAllUsers(){
        List<User> users= new ArrayList<>();
        User user= new User("adrian", "1234");
        User user1 = new User("varmencino", "654");
        User user2= new User("pipe13","andres25");
        User user3= new User("camila", "camilita123");
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }



}
