package LAB;

import java.util.Scanner;

public class Array_firstprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] number = new float[5];
        System.out.println("Enter first number");
        number[0] = sc.nextFloat();
        System.out.println("Enter second number");
        number[1] = sc.nextFloat();
        System.out.println("Enter third number");
        number[2] = sc.nextFloat();
        System.out.println("Enter fourth number");
        number[3] = sc.nextFloat();
        System.out.println("Enter fifth number");
        number[4] = sc.nextFloat();
        for (int i = 0; i <= number.length - 1; i++) {
            if (number[i] < 20) {
                System.out.println(number[i] + " fail in the exam");
            } else {
                System.out.println(number[i]);
            }
        }
    }
}
