package AutomationTesterProgram;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        double marks = sc.nextDouble();
        if(marks>90 && marks<=100){
            System.out.println("A");
        }
        else if(marks>80 && marks<=90){
            System.out.println("B");
        }
        else if(marks>70 && marks<=80){
            System.out.println("C");
        }
        else if(marks>60 && marks<=70){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
