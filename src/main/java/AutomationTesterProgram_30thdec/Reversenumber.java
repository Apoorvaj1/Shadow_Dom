package AutomationTesterProgram_30thdec;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse number = "+rev);
    }
}
