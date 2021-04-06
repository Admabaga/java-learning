package com.adrianlearning.com.adrianlearning.OOP.LOL;

import java.util.List;

public class UserAndPasswordLoger implements Loger {

    UserRepository userRepository;

    public UserAndPasswordLoger(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void login(Credential credential) {
        List<User> allUsers = userRepository.getAllUsers();
        for (int i=0; i < allUsers.size(); i++){
            User auxUser = allUsers.get(i);
            if (auxUser.getUser() == credential.getUser() && auxUser.getPassword() == credential.getPassword() ){
                System.out.println("You're logged");
            }

                   }

    }


}
