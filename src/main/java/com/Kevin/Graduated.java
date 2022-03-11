package com.Kevin;

public class Graduated extends Student{
    int thesis;
    public Graduated(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }
    public void print () {
        System.out.println(name + "\t" + english + "\t" + math + "\t"+getAverage() +"\t" + thesis);
    }
}
