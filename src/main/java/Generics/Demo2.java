package Generics;
class Place{
    Integer a;
    Integer b;
    Place(Integer a,Integer b){
        this.a=a;
        this.b=b;
    }
    public int m1(){
        return this.a+this.b;
    }
}
public class Demo2 {
    int ab;
    String name;
    Demo2(int age,String name){
        this.ab=age;
        this.name=name;

        System.out.println("APOORV");
    }
    public static void main(String[] args) {
        Place a = new Place(10,20);
        System.out.println(a.m1());
        Demo2 b = new Demo2(10,"Apoorv");
        System.out.println(b.ab+" "+b.name);
    }
}
