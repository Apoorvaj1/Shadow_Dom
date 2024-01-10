package InnerClass;

public class Demo {
    int a = 10;
    class Demo1{
        int a = 100;
        public void m1(){
            int a = 1000;
            System.out.println("Hello Inner Class");
            System.out.println(this.a);
            System.out.println(a);
            System.out.println(Demo.this.a);
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo.Demo1 i = demo.new Demo1();
        i.m1();
    }
}
