package Array;

import java.util.Scanner;

public class StringtoArrayWordbyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        // string to "char to char"
        char[] ch = str.toCharArray();
        System.out.println(ch.length);

        //string to "word by word"
        String[] words = str.split("[ ]+");
        System.out.println(words.length);
    }
}
