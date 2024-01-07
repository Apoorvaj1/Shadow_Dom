package Method;

public class Method_1 {
    public String demo(String name){
        return "Hi "+name;
    }
    public static void main(String[] args) {
        Method_1 a = new Method_1();
        System.out.println(a.demo("Apoorv"));
    }
}
