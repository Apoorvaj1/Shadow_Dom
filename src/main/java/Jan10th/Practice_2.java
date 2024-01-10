package Jan10th;

public class Practice_2 extends Practice_1 {
    public static void main(String[] args) {
        Practice_1 s1 = new Practice_1();
        System.out.println(s1.i);  //instance members can be assessed by using object reference
        System.out.println(s1.name);
        s1.m1();
    }
}
