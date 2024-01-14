package Assignment_13thJan.Methodhiding;

public class Test {

    //Method hiding -> Method resolution is takes care by compiler based on the referecne type.
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();
        Parent p1 = new Child();
        p1.m1();
        Child c = new Child();
        c.m1();

    }
}
