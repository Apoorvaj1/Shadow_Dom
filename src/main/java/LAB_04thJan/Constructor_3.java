package LAB_04thJan;

public class Constructor_3 {
        int a = 10;
    }

class Animal extends Constructor_3{
    static int a = 100;
    public void m1(){
       System.out.println(this.a);   // child instance variable
        System.out.println(super.a);  // parent instance variable
        System.out.println(Animal.a);
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.m1();
    }
}
