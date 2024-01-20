package Exception;

public class Project_5 {
    public static void m1() {
         m2();
    }
    public static void m2(){
        m1();
    }
    public static void main(String[] args) {
        try{
            Project_5.m1();
        }catch(StackOverflowError e){
            System.out.println("Overflow");
        }
        finally {
            System.out.println("Yo");
        }
    }
}

