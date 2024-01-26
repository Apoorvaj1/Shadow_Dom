package AutomationTesterProgram_30thdec;

import java.util.Scanner;

public class AnotherProgram_21st {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.nextLine();
        String[] name1 = name.split(" ");
        for(String name2:name1){
            System.out.print(name2+" ");
        }
        System.out.println();

        int start,end=0;
        end=name1.length-1;
        for(start=0;start<end;start++,end--){
            String temp = name1[start];
            name1[start]=name1[end];
            name1[end]=temp;
        }
        for(String a:name1){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
