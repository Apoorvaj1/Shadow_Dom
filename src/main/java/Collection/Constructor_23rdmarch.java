package Collection;

public final class Constructor_23rdmarch {
    public static int age;

    static void m1(){
        System.out.println("Hello");
        System.out.println(age);
    }
    private Constructor_23rdmarch(){
        age=10;
    }



    public static void main(String[] args) {
        Constructor_23rdmarch a = new Constructor_23rdmarch();
        Constructor_23rdmarch.m1();
    }

}
