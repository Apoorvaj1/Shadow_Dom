package Assignment_13thJan;

import java.util.Scanner;

public class Practice123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        if(marks>=90 & marks<=100){
            System.out.println("A grade");
        }
        else if(marks>=80 & marks<=89){
            System.out.println("B grade");
        }
        else if(marks>=70 & marks<=79){
            System.out.println("C grade");
        }
        else if(marks>=60 & marks<=69){
            System.out.println("D grade");
        }
        else{
            System.out.println("F grade");
        }
    }
}
