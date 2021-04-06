package com.adrianlearning.com.adrianlearning.OOP.LOL;

import java.util.List;

public class Credential {
    String user;
    String password;
    String googleCredential;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGoogleCredential(String googleCredential) {
        this.googleCredential = googleCredential;
    }

    public String getUser() {

        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getGoogleCredential() {
        return googleCredential;
    }

    public Credential(String user, String password, String googleCredential) {
        this.user = user;
        this.password = password;
        this.googleCredential = googleCredential;
    }
}
