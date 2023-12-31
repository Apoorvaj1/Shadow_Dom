package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateElement_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter input");
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Your output");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }


        for(int i=0;i<a.length;i++){
            for( int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate values:");
                    System.out.print(a[j] +"\t");
                }
            }
        }
    }
}

