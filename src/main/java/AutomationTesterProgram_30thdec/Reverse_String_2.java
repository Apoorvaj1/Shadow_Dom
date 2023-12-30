package AutomationTesterProgram_30thdec;

import java.util.Scanner;

public class Reverse_String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        String rev_string = "";
        int str_length = str.length()-1;
        for(int i=str_length;i>=0;i--){
            rev_string = rev_string + str.charAt(i);
        }
        System.out.println(rev_string);
    }
}
