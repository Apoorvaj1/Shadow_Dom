package Array;

public class Demo1 {
    public static void main(String[] args) {
        String s = "       APOORV        ";
        System.out.println(s.trim());
        String s1 = "Apoorv";
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.lastIndexOf('o'));
        System.out.println(s1.getClass().getName());
        String s2 = new String("Apoorv");
        System.out.println(s2.getClass().getName());
        String[] s3 = new String[]{"Apoorv","Jain"};
        System.out.println(s3.getClass().getName());
        System.out.println(s3);
        System.out.println(s2);
    }
}
