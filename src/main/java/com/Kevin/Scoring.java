package com.Kevin;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("jack");
        jack.name = "jack";
        jack.english = 70;
        jack.math = 88;
        Student Kevin = new Student("Kevin", 80, 70);
        jack.print();
        Kevin.print();
    }
}
