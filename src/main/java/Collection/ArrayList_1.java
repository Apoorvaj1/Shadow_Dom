package Collection;

import java.util.*;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(a);
        a.add(12);
        a.add(13);
        a.add(112);
        System.out.println(a);
        System.out.println(a.size());
        Object[] ab = a.toArray();

        System.out.println("---------+++++++------------");
        System.out.println(ab);
        System.out.println(ab.length);
        System.out.println(ab.getClass().getSimpleName());
        System.out.println(Arrays.toString(ab));
        for(Object ab2:ab){
            System.out.println(ab2);
        }

        List<String> av = new LinkedList<>();
        av.add("Apoorv");
        System.out.println(av.isEmpty());  //false




    }
}
