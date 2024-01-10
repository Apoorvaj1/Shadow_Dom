package LAB_04thJan;

public class Constructor_2 {
    String name;
    int roll_no;

    public String toString() {
        return "Hey Apoorv";
    }

    Constructor_2(){
        System.out.println("Hello i am Default constructor");
    }
    Constructor_2(String name){
            this.name = name;
    }
    Constructor_2(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    public static void main(String[] args) {
        /*Constructor_2 const2 = new Constructor_2("Apoorv");
        Constructor_2 const3 = new Constructor_2("Apoorv",12);
        System.out.println(const2.name+"  "+const2.roll_no);
        System.out.println(const3.name+"  "+const3.roll_no);
        System.out.println(const3.name);
        System.out.println(const2);*/
        Constructor_2 a = new Constructor_2();
        System.out.println(a.getClass().getSimpleName());   //Only Class name
        System.out.println(a.getClass().getName());// Along with class name ...package name also
        System.out.println(a);
    }
}
