package Array;

import java.util.Scanner;

public class Sumoftwoandcheckthird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();
        System.out.println("Enter third number");
        int third = sc.nextInt();
        boolean bool = false;
        if((first+second)==third){
            bool = true;
        }
        System.out.println("The result is "+bool);
    }
}
