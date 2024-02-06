package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateElement_04thFeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int arr2:arr){
            System.out.print(arr2+" ");
        }
        System.out.println();
        Set<Integer> Duplicate_arr = new HashSet<>();
        Set<Integer> Non_Duplicate_arr = new HashSet<>();
        for(Integer arr3:arr){
            if(!Non_Duplicate_arr.contains(arr3)){
                Non_Duplicate_arr.add(arr3);
            }
            else{
                Duplicate_arr.add(arr3);
            }
        }
        System.out.println(Non_Duplicate_arr);
        System.out.println(Duplicate_arr);
    }
}
