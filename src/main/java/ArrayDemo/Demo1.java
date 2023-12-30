package ArrayDemo;

import java.awt.*;

public class Demo1 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[][]a1 = new int[2][3];
        System.out.println(a.getClass().getName());
        System.out.println(a1.getClass().getName());

        String str = "Apoorv";
        System.out.println(str.getClass().getName());
        System.out.println(str.length());

        int[] a2 = {2,3,4};
        int[] a3 = {5,6};
        //a2=a3;
        a3=a2;   //internally values won't be copied just reference variable will be reassigned.
        System.out.println(a2.length);
        System.out.println(a3.length);

        String[] city = {"Apoorv","Bombay"};
        for(int i=0;i<city.length;i++){
            System.out.println(city[i]);
        }

        char ch = 'A';
        int ch1 = ch;
        System.out.println(ch1);

        char[] age = new char[4];
        System.out.println(age.getClass().getName());

        int[] age1 = new int[6];
        System.out.println(age1);
        System.out.println(age1[0]);

        int[][] age2 = new int[2][2];
        System.out.println(age2);
        System.out.println(age2[0]);
        System.out.println(age2[0][0]);

        Object[] obj = new Object[4];
        obj[0]=new Object();
        obj[1]=new String("Apoorv");
        System.out.println(obj[0]);
        System.out.println(obj[1]);

        Runnable[] run = new Runnable[2];
        run[0] = new Thread();
        System.out.println(run[0]);

        String[] s={"AA","BB","CCC","D"};
        Object[] obj3=s;
        for(int k=0;k<obj3.length;k++){
            System.out.println(obj3[k]);
        }
        System.out.println(s[0].length());
    }
}
