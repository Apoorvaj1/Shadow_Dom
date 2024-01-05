package Array;

public class Demo5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(1000);
        sb.append("ABC");
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
