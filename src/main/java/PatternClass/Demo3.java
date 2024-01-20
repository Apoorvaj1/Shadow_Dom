package PatternClass;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

    public String toString(){
        return "Hello";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine(); //nextLine() -> will return full text up to line breaks.
        String[] str1 = str.split("[.]");
        int count =0;
        for(String str2:str1){
            count++;
            System.out.print(str2+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str1));
        System.out.println("Count is "+count);
    }
}
