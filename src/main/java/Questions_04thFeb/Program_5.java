package Questions_04thFeb;

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][];
        a[0] = new int[]{1,2,3,4};
        a[1] = new int[]{3,4};
        a[2] = new int[]{7,8,9,10};
        a[3] = new int[]{3,7,6,5};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
