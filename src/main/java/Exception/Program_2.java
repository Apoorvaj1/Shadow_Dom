package Exception;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        try {
            System.out.println("Hi");
            /*System.exit(0);*/ // JVM will shutdown so that in the case finally block will not executed.
            int[] a = new int[10];
            System.out.println(a[num]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("Array index out");
        }
        catch(Exception e){
            System.out.println("I am Exception");
        }
        finally {
            System.out.println("Hello FINALLY");
        }
        System.out.println("Hello Apoorv");
    }
}
