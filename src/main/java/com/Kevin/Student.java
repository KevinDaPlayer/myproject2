package com.Kevin;

public class Student {
    String name;
    int english;
    int math;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int english, int math) {
        this.name = name;
        this.math = math;
        this.english = english;
    }
    public Student() {

    }
    public void print() {
        System.out.println(name + "\t" + english + "\t" + math);
    }
}
