package Interface;

public class Child implements Parent1 {

    public String toString(){
        return "Hey";
    }

    public void m1() {
        System.out.println("Hello Apoorv");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        System.out.println(c);
        Parent1 p = new Child();
        p.m1();


    }
}

