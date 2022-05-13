package com.Kevin.Score;
//
public class Student implements Printable{
    String name;
    int english;
    int math;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int english, int math) {
        this(name);
        // this.name = name;
        this.math = math;
        this.english = english;
    }
    public Student() {
        this("Shiro", -1, -1);
    }
    @Override
    public void print() {
        int average = (english + math )/2;
        System.out.println(name + "\t" + english + "\t" + math + "\t"+getAverage());
        if(average < 60) {
            System.out.println("*");
        }  else {
            System.out.println();
        }


    }
    public int getAverage() {
        return (english + math )/2;
    }
}
