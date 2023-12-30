package Var_argsMethod;

public class Demo {

    public static void bike(int... x){
        System.out.println("Honda"+" "+x.length);
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.bike(10);
        bike(10,20,30);
        bike();
    }
}
