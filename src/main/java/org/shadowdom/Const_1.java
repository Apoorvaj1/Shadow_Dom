package org.shadowdom;

class Const_1 {
    String name;
    int age;
    Const_1(String name, int age){
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args){
        Const_1 a1 = new Const_1("Apoorv", 10);
        System.out.println(a1.name +" "+a1.age);
    }
}
