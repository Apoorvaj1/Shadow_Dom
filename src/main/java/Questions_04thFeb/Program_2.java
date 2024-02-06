package Questions_04thFeb;

import java.util.Arrays;

public class Program_2 {
    public static void main(String[] args) {
        int[] a = { 1, 4, 55 };
        int[] b = { 23, 4, 5 };
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(b);
        System.out.println(Arrays.toString(b));
        int[][] c = { a, b };
        System.out.println(c);
        System.out.println(Arrays.deepToString(c));
        // int[][] d = { b, c };
        // System.out.println(Arrays.deepToString(d));
        //System.out.println("Thanks for visiting https://onurdesk.com");
    }
}
