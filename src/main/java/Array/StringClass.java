package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class StringClass {

    public String toString(){
        return "test";
    }
    public static void main(String[] args) {
        String[] a = {"Apoorv", "Jain"};
        System.out.println(a[0]);
        System.out.println(a.getClass().getName());
        System.out.println(a.toString());
        String b = new String("Apoorv");
        System.out.println(b.getClass().getName());
        StringClass ab = new StringClass();
        System.out.println(ab);
        String aa2 = "Apoorv";
        System.out.println(aa2);

        System.out.println("---------------------------");

        ArrayList array = new ArrayList();
        System.out.println(array.getClass().getName());   // java.util.ArrayList
        array.add(10);
        array.add(12);
        System.out.println(array);

        String[] aj3 = {"DOG", "CAT", "ELEPHANT"};
        System.out.println(aj3);

        byte[] b1 = {60,34,56,77};
        System.out.println(b1);
        System.out.println(Arrays.toString(b1));

        int[] i1 = {45,56,65,33};
        System.out.println(i1);

        for(int i:i1){
            System.out.print(i +" ");
        }
        System.out.println();

        String abc = new String("DOG");
        System.out.println(abc.length());
        String[] ab4 = {"ABC", "VBF"};
        System.out.println(Arrays.toString(ab4));
    }
}
