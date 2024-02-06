package Array;

import java.util.Scanner;

public class PracticeQuestion3_03rdFeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any size");
        int size = sc.nextInt();
        System.out.println("Enter array input");
        int[] arr =new int[size];
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            /*if(arr[i]<arr[i+1]){
                System.out.println("Hello");
                flag = true;
*/
            }
        for(int arr2:arr){
            System.out.print(arr2+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                System.out.print(arr[i]+" ");
                break;
            }
        }
    }
       /* for(int arr2:arr){
            System.out.print(arr2+" ");
        }
        System.out.println();*/
        /*if(flag ==false){
            System.out.println("Array is not sorted");
        }
        if(flag ==true){
            System.out.println("Array is sorted");
        }*/
    }

