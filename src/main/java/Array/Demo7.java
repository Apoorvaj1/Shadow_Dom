package Array;

import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {
        String s = "This is Apoorv@1";
        System.out.println(s.length());

        char[] ch = {'J','A','V','A'};
        System.out.println(Arrays.toString(ch));

        String s1 = new String(ch);
        System.out.println(s1);
        String[] s2 = s.split("[ ]+");
        System.out.println(s2.length);
        System.out.println(s2[2]);
        char[] ch1 = s.toCharArray();
        System.out.println(ch1.length);
        for(char ch3:ch1){
            System.out.print(ch3+" ");
        }
        System.out.println();

        System.out.println("==========================================");

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Apoorv");
        sb.append(" is");
        sb.append(" no.");
        sb.append(1);

        String a = new String(sb);
        System.out.println(a);

        StringBuffer sb3 = new StringBuffer("Apoorv");
        sb3.setCharAt(2,'C');
        System.out.println(sb3);
        sb3.setLength(2);
        System.out.println(sb3);

        StringBuffer sb6 = new StringBuffer();
        sb6.append("Apoorv");
        System.out.println(sb6.capacity());
        System.out.println(sb6.length());
        sb6.trimToSize();
        System.out.println(sb6.capacity());

        StringBuffer sb7 = new StringBuffer("Apoorv");
        System.out.println(sb7.capacity());

        StringBuffer sb8 = new StringBuffer("This is Apoorv");
        System.out.println(sb8.length());
        sb8.replace(0,4,"Yo");
        System.out.println(sb8);


    }
}
