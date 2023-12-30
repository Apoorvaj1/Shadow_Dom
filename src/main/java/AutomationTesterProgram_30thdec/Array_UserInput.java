package AutomationTesterProgram_30thdec;

import java.util.Scanner;

public class Array_UserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the input");
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Your output");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
