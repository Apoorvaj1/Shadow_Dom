package AutomationTesterProgram_30thdec;

import java.util.Scanner;

public class Reverse_String_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        char[] chararray = str.toCharArray();
        int start, end =0;
        end = chararray.length-1;
        //System.out.println(chararray);
        //System.out.println(chararray.length);  // Array
        //System.out.println(str.length());  // String

        for(start =0;start<end;start++,end--){
            char temp = chararray[start];
            chararray[start]=chararray[end];
            chararray[end]=temp;
        }
        for(char c:chararray)
            System.out.print(c);
    }
}
