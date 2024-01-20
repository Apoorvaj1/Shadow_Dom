package WrapperClass;

public class FirstProgram {

    public static void main(String[] args) {
        Integer i = new Integer(10);
        System.out.println(i);
        Integer i1 = new Integer("10");
        System.out.println(i1);
        /*Integer i3 = new Integer("ten");
        System.out.println(i3); // throw NumberFormatException
        */
        Integer i4 = Integer.valueOf(10);
        System.out.println(i4);
        /*Integer i5 = Integer.valueOf("ten"); // throw NumberFormatException
        System.out.println(i5);*/

        Double i5 = Double.valueOf("10.23");
        System.out.println(i5);

        Integer i6 = new Integer(10);
        System.out.println(i6.doubleValue());

        Character c = new Character('c');
        char c1 = c.charValue();
        System.out.println(c1);

        Boolean b = new Boolean("true");
        boolean b1 = b.booleanValue();
        System.out.println(b1);  //true

        Boolean b2 = new Boolean("apoorv");
        boolean b3 = b2.booleanValue();
        System.out.println(b3);  //false

        int a = Integer.parseInt("10");   //string to primitive
        System.out.println(a);

        double b5 = Double.parseDouble("10.34");
        System.out.println(b5);





    }
}
