package LAB;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int temp = 0;
        if ((num == 0) || (num == 1) || (num<0)) {
            System.out.println(num + " is not a prime number");
        } else {

            for (int i = 2; i <num / 2; i++) {
                if (num % i == 0) {
                    temp = 1;
                    break;
                }
            }
            if (temp ==0) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }
}
