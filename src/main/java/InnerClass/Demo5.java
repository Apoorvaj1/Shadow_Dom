package InnerClass;

public class Demo5 {

    public String toString(){
        return "Parent toString";
    }
    int a = 10;
    static int b = 12;

    class AJ {
        int a = 11;

        public void m1() {
            System.out.println(Demo5.b);
            System.out.println(this.a);
            System.out.println(Demo5.this.a);
        }
    }
}
    class Demo6 extends Demo5{

        public String toString(){
            return "Child toString";
        }

         public void m2() {
             System.out.println(a);
         }
        public static void main(String[] args) {
            Demo6 d5 = new Demo6();
            System.out.println(d5);
            d5.m2();

            Demo5 d6 = new Demo5();
            System.out.println(d6);

            Demo5.AJ i = d6.new AJ();
            i.m1();

        }
    }

    /*public static void main(String[] args) {
        Demo5 demo = new Demo5();
        Demo5.AJ i= demo.new AJ();
        i.m1();*/
