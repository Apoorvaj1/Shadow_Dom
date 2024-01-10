package LAB_04thJan;

public class Constructor_4 {
    String name;
    boolean isMarried;
    int phone;

    public Constructor_4(){
        name="AJ";
        phone=4356564;
        System.out.println("Hello i am default constructor");
    }
    public  Constructor_4(String userNameEnter){
            this.name = userNameEnter;
    }
    void printDetails(){
        System.out.println("Hi "+this.name);
        System.out.println(this.phone);
    }

    public static void main(String[] args) {
        Constructor_4 a1 = new Constructor_4();
      // a1.printDetails();
        Constructor_4 a2 = new Constructor_4("Apoorv");
        a2.printDetails();
    }
}
