package LAB;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        long fact =1;
        int number = sc.nextInt();
        for(int i=1;i<=number;i++){
        fact*=i;
        }
        System.out.println(fact);
    }
}
