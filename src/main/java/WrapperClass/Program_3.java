package WrapperClass;

public class Program_3 {
    public static void main(String[] args) {
        String age = "10";
        int a = Integer.parseInt(age);
        try {
            System.out.println("Hello Apoorv");
            int b = a / 0;
            System.out.println("Jain");
        }
        catch(NullPointerException e){

            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        catch (ArithmeticException e){
            int c = a/10;
            System.out.println(c);
        }
        finally {
            System.out.println("FINALLY");
        }
        System.out.println("Apoorv Jain");
    }
}

