package PatternClass;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[.]");
        String[] str = p.split("www.google.com");
        for(String str1:str){
            System.out.print(str1+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str));
    }
}
