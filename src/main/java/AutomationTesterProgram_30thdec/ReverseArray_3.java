package AutomationTesterProgram_30thdec;

import java.util.Scanner;

public class ReverseArray_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter input");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Your output");
        for (int a1 : a) {
            System.out.print(a1 + " ");
        }
        System.out.println();
        int start, end=0;
        end = a.length-1;
        for (start = 0; start < end; start++, end--) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

        }
        for (int a2 : a) {
            System.out.print(a2+" ");
        }
    }
}