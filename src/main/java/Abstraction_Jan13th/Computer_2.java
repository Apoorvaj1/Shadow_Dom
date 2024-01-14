package Abstraction_Jan13th;

public class Computer_2 extends Computer_1 {

    @Override
    void brand() {
        System.out.println("Apple");
    }

    public static void main(String[] args) {
        Computer c = new Computer_2();
        c.m1();
        Computer_1 c1 = new Computer_2();
        System.out.println(c1.OperatingSystem());
    }
}
