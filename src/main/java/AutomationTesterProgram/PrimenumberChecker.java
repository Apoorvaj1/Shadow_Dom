package AutomationTesterProgram;

import java.util.Scanner;

public class PrimenumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        int temp = 0;
        if ((number == 0) || (number == 1) || (number < 0)) {
            System.out.println(number + " is not a prime number");
        } else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
        sc.close();
    }
}
