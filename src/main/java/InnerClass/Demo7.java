package InnerClass;

public class Demo7 {
    int a = 10; //Outer class Instance variable
    class Inner{
        int a = 100; // Inner class Instance variable
        public void m1(){
           int a = 1000; //Inner class local variable
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Demo7.this.a);
        }
    }

    public static void main(String[] args) {
        Demo7 a1 = new Demo7();
        Demo7.Inner a2 = a1.new Inner();
        a2.m1();
    }
}
