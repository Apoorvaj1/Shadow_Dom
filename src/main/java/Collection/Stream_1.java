package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(12);
        a.add(15);
        a.add(9);
        a.add(2);
        System.out.println(a);
        System.out.println("--------------------------");
        a.stream().forEach(System.out::println);
        a.stream().forEach(n -> System.out.print(n+ " "));
        System.out.println();
        System.out.println("-----------------------");
        long number = a.stream().count();
        System.out.println(number);
        System.out.println("-------------------------");
        //Integer[] i= a.stream().toArray();

        long number1 = a.stream().filter(i -> i%2!=0).count();
        System.out.println(number1); //1

        List<Integer> list1 = a.stream().map(i -> i+2).collect(Collectors.toList());
        System.out.println(list1);   //[10, 12, 15]

        List<Integer> list2 = a.stream().sorted().collect(Collectors.toList()); //ascending order
        System.out.println(list2);

        List<Integer> list3 = a.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(list3);

        List<Integer> list4 = a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list4);

        List<Integer> list5 = a.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(list5);

        List<Integer> list6 = a.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(list6);

        List<Integer> list7 = a.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(list7);

        Integer list8 = a.stream().max((i1,i2) -> i2.compareTo(i1)).get();
        System.out.println(list8);

        Integer list9 = a.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(list9);

        Integer list10 = a.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(list10);

        Integer list11 = a.stream().sorted().min((i1,i2) -> i2.compareTo(i1)).get();
        System.out.println(list11);

        System.out.println("-------------------------------------------------");
        List<String> arr1 = Arrays.asList("Apoorv","Jain",null,"Jain");
        List<String> arr3= new ArrayList<>();
        System.out.println(arr1);
        Object[] arr2 = arr1.toArray();
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr2));

        arr3 = arr1.stream().filter(w -> w!=null).collect(Collectors.toList());
        System.out.println(arr3);

        for(String s:arr1){
            System.out.print(s+" ");
        }
        System.out.println();

        System.out.println(arr3.set(1,"Agrawal"));   //Jain
        System.out.println(arr3); //[Apoorv, Agrawal, Jain]
        System.out.println("---------------++  ++  ++ ---------------------");


        System.out.println("---------------------------------------------");

        Object[] i1 = a.toArray();
        System.out.println(i1.length);
        System.out.println(Arrays.toString(i1));

        List<Integer> ab = Arrays.asList(12,2,5,16);
        System.out.println(ab);
        Object[] ab1 = ab.toArray();
        System.out.println(ab1);
        for(Object ab2:ab1){
            System.out.print(ab2+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ab1));
        System.out.println("------------------------------------------");

        Integer[] a12 = {12,5,78,90};
        Arrays.sort(a12);
        System.out.println(Arrays.toString(a12));
        System.out.println(Arrays.binarySearch(a12,5));
        System.out.println(Arrays.binarySearch(a12,79));

    }
}
