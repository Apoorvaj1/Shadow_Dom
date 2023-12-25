package AutomationTesterProgram;

import java.util.Scanner;

public class MultiplicationTablePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        System.out.println("Enter range");
        int range = sc.nextInt();
        for(int i=1;i<=range;i++){
            System.out.println(number+" X "+i+" = "+(number*i));
        }
        sc.close();
    }
}
