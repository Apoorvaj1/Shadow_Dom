package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apoorv");
        list.add("Jain");
        List<String> a =List.of("AB","BC","CD");
        List<Object> b =List.of("AB","BC","CD",true,10);

        System.out.println(list);
        System.out.println(a);
        System.out.println(b);

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
        System.out.println();

        List<Object> ab1 = List.of("Apoorv","Jain");
        System.out.println(ab1);

        System.out.println("--------------------------------");

        ArrayList<Object> abc = new ArrayList<>();
        abc.add("Apoorv");
        abc.add(null);
        System.out.println(abc);

        ListIterator li = list.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

    }
}
