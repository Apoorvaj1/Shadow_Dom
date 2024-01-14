package Assignment_13thJan.MethodOverriding;

public class Test {
    // Method Overriding means when two or more methods having same name and same argument types
    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
        Child c = new Child();
        c.m1();
        Parent p1 = new Parent();
        p1.m1();
    }
}
