package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output");
            System.out.println(Arrays.toString(arr));  // Print element in the form of array

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        String a1 = "APOORV";
        char[] a2 = a1.toCharArray();
        System.out.println(a2[0]);


    }
}
