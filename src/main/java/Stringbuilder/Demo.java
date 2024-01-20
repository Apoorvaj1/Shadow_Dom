package Stringbuilder;

public class Demo {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Apoorv");
        System.out.println(sb.length());
        System.out.println(sb.capacity());  //16+6 = 22
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());
        sb1.append("Apoorv");
        sb1.trimToSize();
        System.out.println(sb1.capacity());
        System.out.println(sb1);
        sb1.ensureCapacity(1000);
        System.out.println(sb1.capacity());
        System.out.println(sb1.charAt(0));
        sb1.setLength(4);
        System.out.println(sb1);

        sb1.insert(2,'c');
        System.out.println(sb1);
        System.out.println(sb1.reverse());


       /* sb1.insert('e',0);
        System.out.println(sb1);*/
    }
}
