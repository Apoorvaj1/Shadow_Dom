package Jan10th;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        int sum=0,r;
        while(a>0){
             r=a%10;
             sum=sum+r;
             a=a/10;
        }
        System.out.println(sum);
    }


}
