package AutomationTesterProgram;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal");
        double principal = sc.nextDouble();
        if(principal<0){
            System.out.println("Invalid input. Enter valid Principal");
        }
        System.out.println("Enter rate");
        double rate = sc.nextDouble();
        if(rate<0){
            System.out.println("Invalid input. Enter valid rate");
        }
        System.out.println("Enter time");
        double time = sc.nextDouble();
        if(time<0){
            System.out.println("Invalid input. Enter valid time");
        }
        double SI = (principal*rate*time)/100;
        System.out.printf("Simple interest for Principal amount $%.2f, rate %.2f, time %.2f is $%.2f",principal,rate,time,SI);
        sc.close();
    }
}
