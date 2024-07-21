package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1 {

    public static void verifyNumber(int[] arr,int num){

        boolean bool = false;
        for(int a1:arr){
            if(a1==num){
                bool =true;
                break;
            }
        }
        System.out.println("Is "+num+" available in "+Arrays.toString(arr)+" : "+bool);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter input");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int arr1:array){
            System.out.print(arr1+"\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println("Enter number that you want to search");
        int n1 = sc.nextInt();
        verifyNumber(array,n1);

    }
}
