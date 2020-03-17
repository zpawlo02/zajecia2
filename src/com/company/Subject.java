package com.company;

import java.util.ArrayList;

public class Subject {

    private String name, teacher;
    private int aOfStudents;
    private ArrayList<Student> students = new ArrayList<>();

    public Subject(String name, int aOfStudents) {
        this.name = name;
        this.aOfStudents = aOfStudents;
    }

    public Subject(Subject subject){
        this.name = subject.name;
    }

    public boolean addStudent(Student newStudent){
        if(students.size() < aOfStudents){
            students.add(newStudent);
            return true;
        }
        return false;
    }

    public static ArrayList<Subject> checkStudent(ArrayList<Subject> subjects, Student student){
        ArrayList<Subject> nSubjects = new ArrayList<>();
        for(int i = 0; i < subjects.size(); i++){
            for (int j = 0; j < subjects.get(i).students.size(); j++){
                if(student.getLogin().equals(subjects.get(i).students.get(j))){
                    nSubjects.add(subjects.get(i));
                }
            }
        }
        return nSubjects;
    }


}
