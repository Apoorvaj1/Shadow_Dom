package Array;

import java.util.Arrays;

public class MultiDimentional {
    public static void main(String[] args) {
        int[] a = {10,20,34};
        for(int b:a){
            System.out.print(b+"\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
        int[][] a1 = {{1,2,3},{2,3,4}};
        System.out.println(Arrays.deepToString(a1));
        System.out.println("----------------------");

        for(int[] a2:a1){
            System.out.println(Arrays.toString(a2));
        }



    }

}
