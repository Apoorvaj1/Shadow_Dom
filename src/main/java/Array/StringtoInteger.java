package Array;

import java.util.Scanner;

public class StringtoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length());
        int a = Integer.parseInt(str);
        System.out.println(a);
    }
}
