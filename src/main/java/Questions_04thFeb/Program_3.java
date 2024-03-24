package Questions_04thFeb;

import java.util.Arrays;

public class Program_3 {
    public static void main(String[] args) {
        String[] arr = { "om prakash", "subani", "naveen" };
        String s1 = String.join(" ", arr);
        String s2 = String.join(",", arr);
        System.out.println(arr[0]);
        for(String arr1:arr){
            System.out.print(arr1+" ");
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Arrays.toString(arr));
    }
}
