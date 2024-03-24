package Construtor_23rdmarch;

public class B extends A{
    String name_B;
    public B(String name){
        this.name_B = name;
        System.out.println("Hello I am "+this.name_B);
    }

    public static void main(String[] args) {
        B b = new B("Apoorv");
    }
}
