package InnerClass;

public class Demo2 {
    class Inner{
        public void m1(){
            System.out.println("Hello");
        }
    }
    public void m2(){
        Inner inner = new Inner();
        inner.m1();
    }

    public static void main(String[] args) {
        Demo2 a = new Demo2();
        a.m2();
    }
}
