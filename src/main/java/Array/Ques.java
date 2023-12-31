package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        //int[] a =new int[5];
        for(int a1:a){
            System.out.println(a1);
        }
        System.out.println(Arrays.toString(a));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine().toLowerCase();

        System.out.println(str.length());
        char[] ch = str.toCharArray();
        System.out.println(ch);
        System.out.println(ch.length);
        System.out.println(Arrays.toString(ch));
        System.out.println(ch[2]);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                continue;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }


        }

    }

