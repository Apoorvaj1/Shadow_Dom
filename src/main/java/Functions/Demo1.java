package Functions;

public class Demo1 {
    public static void main(String[] args) {

        int c = sum(10,20); // call to the function
        System.out.println(c);

        Thread thread = new Thread();
        System.out.println(thread instanceof Runnable);
        System.out.println(thread instanceof Object);

    }

    public static int sum(int a, int b){  // definition of the function
        return a+b;
    }
}
