package AutomationTesterProgram;

import java.util.Scanner;

public class SumofDigit_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int number= sc.nextInt();
        int sum=0,r;
        while(number>0){                //222 = 2+2+2
            r=number%10;
            sum=sum+r;
            number=number/10;
        }
        System.out.println("Sum of digits = "+sum);
        sc.close();
    }
}
