package com.company;

public class Student extends User {

    private int semestr;

    public Student(String login, String password, int semestr) {
        super(login, password);
        this.semestr = semestr;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Semestr: " + semestr);
    }



}
