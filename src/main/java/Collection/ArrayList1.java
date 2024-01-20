package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apoorv");
        list.add("Jain");
        List<String> a =List.of("AB","BC","CD");
        List<String> b =List.of("AB","BC","CD");

        System.out.println(list);
        System.out.println(a);

        System.out.println("---------------------------");

        System.out.println(list.size());
        System.out.println(a.size());

        System.out.println("---------------------------");
        try{
            System.out.println(list.get(2));
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }

        System.out.println("---------------------------");

        String name = list.set(1,"Gupta");
        System.out.println(list);
        System.out.println(name);

        System.out.println("---------------------------");

        List<Object> ab = new ArrayList<>();
        ab.add("Apoorv");
        ab.add(12);
        ab.add('a');
        System.out.println(ab);

        System.out.println("-----------------------------");

        System.out.println(list.indexOf("Jain")); // -1
        System.out.println(list.indexOf("Gupta"));

        System.out.println("------------------------------");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-------------------------------");

        System.out.println(list.contains(12));
        System.out.println(list.contains("Apoorv"));

        System.out.println("-------------------------------");

        System.out.println(a.equals(b));

        System.out.println("-------------------------------");

        for(String a1:a){
            System.out.print(a1+" ");
        }
        System.out.println();

        System.out.println("--------------------------------");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
