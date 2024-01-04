package com.abstract1;

public class Test1 {
    public void m1(int a){
        System.out.println("Int a");
    }
    public void m1(double b){
        System.out.println("Double b");
    }
    public void m1(float c){
        System.out.println("Float c");
    }
    public int m1(String a1){
        return a1.length();
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1(10);
        test1.m1(10.23);
        test1.m1(10.2f);
        System.out.println(test1.m1("APOORVJ"));
    }
}
