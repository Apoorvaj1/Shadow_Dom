package Jan10th;

public class Practice_6 {
    String name = "Apoorv";
    public String toString(){
        return "Hi "+this.name +" Its manually changed";
    }
    public static void main(String[] args) {
        Practice_6 sb = new Practice_6();
        System.out.println(sb);
        Practice_6 sb2 = new Practice_6();
        System.out.println(sb);
        System.out.println(sb.getClass().getSimpleName());
        System.out.println(sb.getClass().getName());
        System.out.println(sb.getClass());

    }
}
