package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(1);
        a.add(30);
        a.add(40);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

        Collections.reverse(a);
        System.out.println(a);

        Integer d = a.get(0);
        System.out.println(d);
    }
}
