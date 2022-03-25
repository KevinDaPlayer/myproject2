package com.Kevin.Score;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("jack", 65, 77);
        Student Kevin = new Student("Kevin", 80, 70);
        Student s = new Student();
        Graduated nishida = new Graduated("NIshida", 77, 90, 89);
        jack.print();
        Kevin.print();
        s.print();
        nishida.print();
    }
}
