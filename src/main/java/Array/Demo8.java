package Array;

public class Demo8 {
    public static void main(String[] args) {
        String s = "Apoorv";
        String s1= s.concat("Jain");
        System.out.println(s);  //Apoorv
        String s3 = "Apoorv"+"Jain";
        System.out.println(s1==s3);
        String s5 = new String("ApoorvJain");
        System.out.println(s1==s5);
        s5=s5.intern();
        System.out.println(s3==s5);

        String s6= s+"Jain";
        System.out.println(s1==s6);
        final String s7 = "Jain";
        String s8 = "Apoorv"+s7;
        System.out.println(s3==s8);


        StringBuffer s2 = new StringBuffer("Apoorv");
        s2.append("Jain");
        System.out.println(s2);  //ApoorvJain
    }
}
