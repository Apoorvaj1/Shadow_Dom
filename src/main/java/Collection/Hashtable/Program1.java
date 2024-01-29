package Collection.Hashtable;

import java.util.Hashtable;

public class Program1 {
    int i;
    Program1(int i){
        this.i=i;
    }

    public String toString(){
        return i+" ";
    }

    public int hashCode(){
        return i;
    }
    public static void main(String[] args) {

        Program1 a1 = new Program1(10);
        System.out.println(a1);
        System.out.println(a1.i);
     Hashtable<Object,String> a = new Hashtable<>(); //default capacity -> 11
     a.put(new Program1(5),"A");
     a.put(new Program1(6),"B");
     a.put(new Program1(12),"C");

     System.out.println(a);
    }
}
