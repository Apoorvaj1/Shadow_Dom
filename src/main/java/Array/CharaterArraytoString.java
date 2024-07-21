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
            System.out.print(str2);
        }
        System.out.println();

        String[] str4 = new String[]{"Apoorv","Jain"};
        System.out.println(str4.length);
        System.out.println(str4[1]);
        System.out.println(Arrays.toString(str4));
        for(String a:str4){
            System.out.print(a+" ");
        }

        System.out.println();
        System.out.println("-----------------------------------------");


        String[] d = {"Apoorv", "AJ"};
        String d1 = new String(Arrays.toString(d));
        System.out.println(d1);

        String asd = "This is EPIC";
        System.out.println(asd.length());
        String[] asd1 = asd.split("[ ]+");
        System.out.println(asd1.length);
        char[] asd2 = asd.toCharArray();
        System.out.println(asd2.length);
        String[] asd3 = {"APOORV","QWERTY"};
        System.out.println(Arrays.toString(asd3));
        System.out.println(asd3[1]);

        byte[] arr = {97,98,99,100,127};
        System.out.println(arr);
        System.out.println(arr[0]);
        String arr2 = new String(arr);
        System.out.println(arr2);

        String a = "bacdefga";
        System.out.println(a.length());
        System.out.println(a.substring(3));
        System.out.println(a.substring(2,5));
        System.out.println(a.replace('b','z'));
        System.out.println(a.indexOf('c'));
        System.out.println(a.indexOf('a'));
        System.out.println(a.lastIndexOf('a'));
        System.out.println(a.charAt(3));
    }
}
