package InnerClass;

public class Demo3 {

    String carname;

    public Demo3(String carname){
        this.carname=carname;
        System.out.println("Car name is "+carname);
    }
    int a =10;
    static int b=1000;
    public class AB{
        int a = 101;
        int horsepower;

        public static void m2(){
            System.out.println(b);
        }
        public AB(int horsepower){
            this.horsepower=horsepower;
            System.out.println("Hi i am horsepower "+ horsepower);
        }

        public void m1(){
            System.out.println("Hello1");
            System.out.println(a);
            System.out.println(Demo3.this.a);
            System.out.println(Demo3.b);
        }
    }

    public static void main(String[] args) {
        Demo3 a = new Demo3("Lambo");  //Whenever object is created constructor will be called automatically.
        Demo3.AB ab = a.new AB(1200);
        ab.m1();


        //ab.m1();
        Demo3.AB.m2();
    }
}
