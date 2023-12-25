package AutomationTesterProgram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        long fact =1;
        for(int i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+number+" is "+fact);
        sc.close();
    }
}
