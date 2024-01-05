package Array;

public class Demo {
    int i;
    public Demo(int i){
        this.i=i;
    }
    public int hashCode(){
        return i;
    }
    public static void main(String[] args) {
       //Animal a = new Animal();
       //System.out.println(a);
       //System.out.println(a.getClass().getName());
       //a.m1();
       Demo demo = new Demo(100);
       System.out.println(demo);

    }

}


