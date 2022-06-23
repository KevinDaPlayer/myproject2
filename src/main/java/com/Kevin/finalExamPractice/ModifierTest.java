package com.Kevin.finalExamPractice;

public class ModifierTest {
    public int a ;
    protected String b ;
    public  ModifierTest (int a, String b) {
        this.a = a;
        this.b = b;
    }
    public void print () {
        System.out.println(b + a + "Hello");
    }

    public static void main(String[] args) {
        ModifierTest modifierTest = new ModifierTest(555, "真的假的");
        modifierTest.print();
    }
}
