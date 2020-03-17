package com.company;

public class Teacher extends User {

    protected String login, password;
    public String workIn;

    public Teacher(String login, String password, String workIn) {
        super(login, password);
        this.workIn = workIn;
    }

    @Override
    public void print() {
        super.print();
    }
}
