package ArrayDemo;

public class ISL {
    static int a;  //static variable
    int c;  // instance variable
    public static void main(String[] args) {
        ISL isl = new ISL();
        isl.vehicle();
        a=12;
        System.out.println(a);
    }

    public void vehicle(){
        int b= 10; //local variable
        c=10;
        a=11;
        System.out.println(a);
        System.out.println(b);
    }
}
