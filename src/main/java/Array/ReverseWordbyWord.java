package Array;

import java.util.Scanner;

public class ReverseWordbyWord {

    public static String ReverseWord(String word){
        String[] str = word.split("[ ]+");
        StringBuffer sb = new StringBuffer();
        int strlength = str.length-1;
        for(int i=strlength;i>=0;i--){
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.nextLine();
        System.out.println(ReverseWord(name));
    }
}
