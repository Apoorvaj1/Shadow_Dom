package Array;

public class Demo3 {
    public static void main(String[] args) {
        String s = "Apoorv";
        String s2=s;
        String s1 = s.concat("Jain");
        s2=s1;
        //s=s1.concat("Jain");
        System.out.println(s);
        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s2==s1);
    }
}
