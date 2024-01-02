package Array;

import java.util.Arrays;

public class CharaterArraytoString {
    public static void main(String[] args) {
        char[] ch = {'J','A','V','A'};
        String str = new String(ch);
        System.out.println(str);

        for(char ch1:ch){
            System.out.print(ch1);
        }
        System.out.println();
        System.out.println("*********************");
        String s = "This is my name";
        char[] str1 = s.toCharArray();
        System.out.println(str1);
        for(char str2:str1){
            System.out.println(str2);
        }

        String[] str4 = new String[]{"Apoorv","Jain"};
        System.out.println(str4.length);
        System.out.println(str4[1]);
        System.out.println(Arrays.toString(str4));
        for(String a:str4){
            System.out.print(a+" ");
        }

        System.out.println();

        String[] d = {"Apoorv", "AJ"};
        String d1 = new String(Arrays.toString(d));
        System.out.println(d1);
    }
}
