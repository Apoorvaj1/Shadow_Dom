package AutomationTesterProgram;

import java.util.Scanner;

public class FindMinimumNofromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        if (size < 1) {
            System.out.println("Enter more than 1");
        } else {
            System.out.println("Enter input");
            int[] a = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Your output");
            for (int a1 : a) {
                System.out.print(a1 + " ");
            }
            System.out.println();
            int min = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println("Minimum value is: " + min);

        }
    }
}
