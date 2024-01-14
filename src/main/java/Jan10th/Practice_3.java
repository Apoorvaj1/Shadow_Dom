package Jan10th;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.nextLine();
        String[] str = name.split(" ");
        //System.out.println(str.length);
        for (String aj : str) {
            System.out.print(aj + " ");
        }
        System.out.println();
        //System.out.println(str.length);
        System.out.println("Enter first word (in number)");
        int i = sc.nextInt();
        if (i > str.length - 1) {
            System.out.println("Enter minimum number");
        } else {
            System.out.println("Enter second word (in number)");
            int j = sc.nextInt();
            if (j > str.length - 1) {
                System.out.println("Enter minimum number");
            }
            else{
                String temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                for (String aj2 : str) {
                    System.out.print(aj2 + " ");
                }
                System.out.println();
            }
        }
    }
}
