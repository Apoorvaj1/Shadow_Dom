package InnerClass;

public class Demo {
    class Demo1{
        public void m1(){
            System.out.println("Hello Inner Class");
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo.Demo1 i = demo.new Demo1();
        i.m1();
    }
}
