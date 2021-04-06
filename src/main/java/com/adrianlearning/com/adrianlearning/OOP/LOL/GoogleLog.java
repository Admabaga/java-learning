package com.adrianlearning.com.adrianlearning.OOP.LOL;

import java.util.List;

public class GoogleLog implements Loger {
    GoogleRepository googleRepository;

    public GoogleLog(GoogleRepository googleRepository) {
        this.googleRepository = googleRepository;
    }

    @Override

    public void login(Credential credential) {
        List<GoogleUser> googleAllUser = googleRepository.googleUserList();
        for (int i=0; i < googleAllUser.size(); i++){
            GoogleUser auxUser = googleAllUser.get(i);
            if (auxUser.getGoogleCode() == credential.googleCredential){
                System.out.println("You're Logg");
            }
        }

    }
}
