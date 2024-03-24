package Encapsulation;

public class Encap2 {
    public static void main(String[] args) {
        Encap1 a2 = new Encap1();
        a2.setAge(10);
        a2.setAge(1000);
        Encap1.age = 10;
        System.out.println(Encap1.age);
    }

}
