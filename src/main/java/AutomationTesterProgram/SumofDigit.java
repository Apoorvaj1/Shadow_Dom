package AutomationTesterProgram;

import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=number;i++){              // 6 = 6+5+4+3+2+1
            sum = sum+i;
        }
        System.out.println("Sum of digit "+sum);
    }
}
