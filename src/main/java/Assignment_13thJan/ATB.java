package Assignment_13thJan;

import java.util.Arrays;
import java.util.Scanner;

public class ATB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter students details");
        String[] details = new String[size];
        for(int i=0;i<details.length;i++){
            details[i]=sc.next();
        }
        System.out.println("------------Output--------------");
        for(String details1:details){
            System.out.print(details1+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(details));
    }
}
