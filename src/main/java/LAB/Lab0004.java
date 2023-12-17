package LAB;

import java.util.Scanner;

public class Lab0004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Greater value is");
        int c = (a>b)? a:b;
        System.out.println(c);
    }
}
