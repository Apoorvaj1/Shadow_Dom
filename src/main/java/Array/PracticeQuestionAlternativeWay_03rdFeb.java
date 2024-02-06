package Array;

import java.util.Scanner;

public class PracticeQuestionAlternativeWay_03rdFeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any size");
        int i,j;
        int size = sc.nextInt();
        System.out.println("Enter array input");
        int[] arr = new int[size];
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int arr1:arr){
            System.out.print(arr1+" ");
        }
        System.out.println();
        int start,end=0;
        end = arr.length-1;
        for(start=0;start<end;start++,end--){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        for(int arr2:arr){
            System.out.print(arr2+" ");
        }
        System.out.println();









        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        System.out.println(sc.hasNextInt());*/
    }
}
