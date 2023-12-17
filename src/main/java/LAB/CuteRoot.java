package LAB;

import java.util.Scanner;

public class CuteRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y:");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z:");
        double z = sc.nextDouble();
        double cube_root = Math.cbrt(x * x+ y * y-Math.abs(z));
        System.out.println("Result:"+cube_root);

    }
}
