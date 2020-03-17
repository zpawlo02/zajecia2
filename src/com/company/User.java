package com.company;

public class User {

    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void authorize(String pass, String login){
        if(pass.equals(this.password) && login.equals(this.login)){
            System.out.println("Authorized!");
        }else {
            System.out.println("Not Authorized!");
        }
    }

    public void print(){
        System.out.println("Login: " + login + "Password: " + password);
    }

    public String getLogin() {
        return login;
    }
}
