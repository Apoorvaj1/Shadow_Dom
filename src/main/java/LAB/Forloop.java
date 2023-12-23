package LAB;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        for(int i=0;i<1;i++){
            System.out.println("Apoorv");
        }
        for(int j=1;j<=10;j++){
            System.out.println("Value is =" +j);
            if(j==5){
                break;
            }
        }
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number for doing Multiplication");
        int number = sc.nextInt();
        for(int g = 1; g<=10;g++){
            System.out.println(number + " X " + g + " = "+ (number*g));
        }
    }
}
