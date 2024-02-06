package Questions_04thFeb;

import java.util.Scanner;

public class FindSecondLargestElementinArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter input");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int arr2:arr){
            System.out.print(arr2+" ");
        }
        System.out.println();
        System.out.println("Array in descending order");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int arr3:arr){
            System.out.print(arr3+" ");
        }
        System.out.println();
        System.out.println("Second largest element is");
        System.out.println(arr[1]);
    }
}
