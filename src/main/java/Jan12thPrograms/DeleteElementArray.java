package Jan12thPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter element you want to delete");
        int del = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(del==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                    System.out.println("Element removed successfully");
                    break;
                }
            }

        }
    }
}
