package LAB;

import java.util.Scanner;

public class Twodimentionalarray {
    public static void main(String[] args) {

        int a[][] = new int[2][2];
        a[0][0] = 12;
        a[0][1] = 13;
        a[1][0] = 14;
        a[1][1] = 15;

        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] +"\t");
            }
            System.out.println(" ");
        }

        int[][] a1 = {{2,3,4}, {4,5,6}};
        for(int i1=0;i1<a1.length;i1++){
            for(int j1=0;j1<a1[i1].length;j1++){
                System.out.print(a1[i1][j1] +"\t");
            }
            System.out.println(" ");
        }
    }
}
