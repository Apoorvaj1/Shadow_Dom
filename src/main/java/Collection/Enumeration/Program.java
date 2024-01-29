package Collection.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Program {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        /*v.add(10);
        v.addElement(11);
        System.out.println(v);*/

        // Legacy classes -> Vector, Stack, Dictionary, Hashtable, Properties
        // Legacy interface -> Enumeration


        for(int i=0;i<=10;i++){
            v.add(i);
        }
        System.out.println(v);

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            Integer i = (Integer)e.nextElement();
            System.out.println(i);
        }
    }
}
