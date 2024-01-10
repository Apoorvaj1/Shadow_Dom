package HieraricalInheritence;

public class Truck extends Vehicle{
    public void Truck1(){
        System.out.println("I am "+getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Truck a = new Truck();
        //Vehicle a1 = new Truck();
        a.Truck1();
    }
}
