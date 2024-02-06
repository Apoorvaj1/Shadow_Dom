package Questions_04thFeb;

import java.util.Arrays;
import java.util.List;

public class Program_6 {
    public static void main(String[] args) {
        String name = "isadsfds";
        char[] ch = name.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        for(char a:ch){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.asList("Hello","AJ"));
        List<String> str = Arrays.asList("Hello","Apoorv");
        System.out.println(str);
    }
}
