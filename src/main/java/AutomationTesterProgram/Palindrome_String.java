package AutomationTesterProgram;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.next();
        String revstr ="";
        int strlength = str.length();
        for(int i=(strlength-1);i>=0;i--){
            revstr = revstr + str.charAt(i);
        }
        if(str.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println(str+" is a Palindrome String");
        }
        else{
            System.out.println(str+" is not a Palindrome String");
        }
        sc.close();
    }
}
