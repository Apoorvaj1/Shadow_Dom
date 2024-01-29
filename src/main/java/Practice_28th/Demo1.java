package Practice_28th;

public class Demo1 {

    public String toString(){
        return "I am toString";
    }

    public void m1(int... x){
        System.out.println("Integer");
    }

    public void m1(double... x){
        System.out.println("Double");
    }
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        System.out.println(demo);
        demo.m1(10,20);
        demo.m1(10.2);
    }
}
