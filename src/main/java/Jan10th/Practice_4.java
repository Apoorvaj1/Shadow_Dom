package Jan10th;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine().trim();
        String[] a = str.split("[ ]+");
        for(String j:a){
            System.out.print(j +" ");
        }
        System.out.println();
        System.out.println(a[a.length-2]);
        sc.close();
    }
}
