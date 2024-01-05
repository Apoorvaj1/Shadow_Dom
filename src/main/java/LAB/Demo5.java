package LAB;
import InnerClass.Demo3;
public class Demo5 {
    public static void main(String[] args) {
        Demo3 a = new Demo3();
        Demo3.AB i = a.new AB();
        i.m1();
    }
}
