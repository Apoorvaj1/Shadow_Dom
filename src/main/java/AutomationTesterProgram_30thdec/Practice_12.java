package AutomationTesterProgram_30thdec;

import java.util.Arrays;

public class Practice_12 {
    public String toString(){
        return "Hi Apoorv";
    }
    public static void main(String[] args) {
        String name = "Apoorv Jain";
        String[] str = name.split(" ");
        System.out.println(str.length);
        for(String name1:str){
            System.out.print(name1+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str));
        System.out.println(str);
        System.out.println(str.getClass().getSimpleName());
        Practice_12 a = new Practice_12();
        System.out.println(a);

    }
}
