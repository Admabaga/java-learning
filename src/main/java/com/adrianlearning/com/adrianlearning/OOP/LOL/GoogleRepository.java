package com.adrianlearning.com.adrianlearning.OOP.LOL;

import java.util.ArrayList;
import java.util.List;

public class GoogleRepository {
    List<GoogleUser> googleUserList(){
        List<GoogleUser> googleUsers= new ArrayList<>();
        GoogleUser user = new GoogleUser("123456789");
        GoogleUser user1 = new GoogleUser("158486489");
        GoogleUser user2 = new GoogleUser("196576896");
        GoogleUser user3 = new GoogleUser("014812557");
        GoogleUser user4 = new GoogleUser("796242200");
        GoogleUser user5 = new GoogleUser("987235634");
        GoogleUser user6 = new GoogleUser("987456321");
        googleUsers.add(user);
        googleUsers.add(user1);
        googleUsers.add(user2);
        googleUsers.add(user3);
        googleUsers.add(user4);
        googleUsers.add(user5);
        googleUsers.add(user6);
        return googleUsers;
    }
}
