package Questions_04thFeb;

import java.util.Scanner;

public class Matrix_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i value");
        int i = sc.nextInt();
        System.out.println("Enter j value");
        int j = sc.nextInt();
        int[][] arr = new int[i][j];
        System.out.println("Enter array input");
        for(int k=0;k<arr.length;k++){
            for(int l=0;l<arr[k].length;l++){
                arr[k][l] = sc.nextInt();
            }
        }
        System.out.println("Output");
        for(int k=0;k<arr.length;k++){
            for(int l=0;l<arr[k].length;l++){
                System.out.print(arr[k][l]+" ");
            }
            System.out.println();
        }
    }
}
