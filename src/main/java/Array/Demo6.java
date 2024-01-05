package Array;

public class Demo6 {
    int a =100;  //instance variable
    static int b = 1006;  //static variable
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.m1();
        int a =11;  //local variable
        System.out.println(a);
        System.out.println(Demo6.b);
    }
}
class Dog extends Demo6{
    int a = 10;  //instance variable
    public void m1(){
        int a=102;  //local variable
        System.out.println(this.a); // this -> refers to current class instance member
        System.out.println(super.a); // super -> refers to super class instance member
        System.out.println(a);
    }
}
