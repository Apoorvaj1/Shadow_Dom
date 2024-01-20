package Exception;

public class Program_1 {
    public static void main(String[] args) {
        try {
            System.out.println("I am inside try");
            String name = null;
            System.out.println(name.length());
        }catch(Throwable e){
            e.printStackTrace();
            System.out.println("Resolved");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        /*catch (ArithmeticException e){
            System.out.println("I am AE");
        }*/
        System.out.println("I am outside");

    }
}
