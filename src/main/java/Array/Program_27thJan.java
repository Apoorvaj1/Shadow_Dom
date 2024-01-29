package Array;

import java.util.Collections;
import java.util.Scanner;

public class Program_27thJan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.nextLine();
        String name1 = name.toLowerCase();
        int count =0;
        int temp =0;

        for(int i=0;i<name1.length();i++){
            char ch = name1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
                count++;
            }
            else{
                temp++;
            }
        }
        System.out.println("Number of vowels are "+count);
        System.out.println("Number of consonent are "+temp);
    }
}
