package AutomationTesterProgram;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        String revstr ="";
        int strlength = str.length()-1;
        for(int i=strlength;i>=0;i--){
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
