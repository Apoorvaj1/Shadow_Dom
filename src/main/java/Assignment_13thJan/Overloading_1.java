package Assignment_13thJan;

public class Overloading_1 {
    public void m1(){
        System.out.println("no-arg arguments");
    }
    public void m1(int i){
        System.out.println("int argument");
    }
    public void m1(double d){
        System.out.println("double arguments");
    }
    public static void main(String[] args) {
        Overloading_1 a = new Overloading_1();
        a.m1();
        a.m1(10);
        a.m1(10.4);
        a.m1('a');
        a.m1(10.4f);
    }
}
