package Array;

public class Demo3 {
    public static void main(String[] args) {
        String s = "Apoorv";
        String s2=s;
        String s1 = s.concat("Jain");
        //s=s1.concat("Jain");
        System.out.println(s);
        System.out.println(s==s1);
        System.out.println(s==s2);
    }
}
