package Array;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        String s = new String("Durga");
        s.concat("Apoorv");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Apoorv");
        sb.append("Jain");
        System.out.println(sb);
        System.out.println(sb.capacity());   //capacity = sb.length()+16

        String name = "Apoorv";
        System.out.println(name.length());
        StringBuffer name1 = new StringBuffer();
        name1.append("ABCFDFFFFFFFFFFF");
        name1.append("g");
        System.out.println(name1.capacity());
        System.out.println(name1.length());
        StringBuffer name3 = new StringBuffer();
        System.out.println(name3.capacity());
    }
}
