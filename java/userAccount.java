package com.example.member;

public class userAccount {

    public userAccount() {
    }

    public String getIdToken() {return idToken;}

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    private String idToken;

    public String getEmailId() {return emailId;}

    public void setEmailId(String emailId) {this.emailId = emailId;}

    private  String emailId;

    public String getPassword() {return password;}

    public  void setPassword(String password) {this.password = password; }

    private String password;

}
