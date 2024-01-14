package Assignment_13thJan;

public class Overloading {

    // Overloading means class having two or more method having same number but different argument types
    public void vehicle(String name){
        System.out.println("VEHICLE");
    }
    public void vehicle(int number){
        System.out.println("NUMBER");
    }

    public static void main(String[] args) {
        Overloading a = new Overloading();
        a.vehicle("Apoorv");
        a.vehicle(10);
    }
}