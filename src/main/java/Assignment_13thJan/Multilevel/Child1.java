package Assignment_13thJan.Multilevel;

public class Child1 extends Child{

    public void m4(){
        System.out.println("HELLO");
    }
    public static void main(String[] args) {
        Child1 c = new Child1();
        System.out.println(c.m3(10));
        c.m4();
        Child c1 = new Child1();
        c1.m1();
        c1.m2();
        ParentML p = new Child1();
        p.m1();
    }
}
