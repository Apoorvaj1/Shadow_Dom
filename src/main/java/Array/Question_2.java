package Array;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int a1:a){
            System.out.println(a1);
        }
    }
}
