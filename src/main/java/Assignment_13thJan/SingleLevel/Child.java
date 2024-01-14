package Assignment_13thJan.SingleLevel;


public class Child extends Parent{

    public int m3(int a){
        return 22;
    }

    public void m2(){
        System.out.println("Child");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        c.m2();
        System.out.println(c.i);
        System.out.println(c.m3(10));
        System.out.println("-----------------------");
        Parent p = new Child();
        p.m1();
    }


}
