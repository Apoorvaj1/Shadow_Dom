package Generics;

class Child<T extends Number>{
   T a,b;
   Child(T a,T b){
       this.a = a;
       this.b = b;
   }

   public Integer  add(T a,T b) {
    System.out.println("Hello");
    return a.intValue()+b.intValue();
   }

}
public class Demo {
    public static void main(String[] args) {
        Child<Integer> a = new Child<>(10,20);
        System.out.println(a.a +" "+a.b);
        System.out.println(a.add(10,3));
        //System.out.println(Integer.this.a);
    }
}
