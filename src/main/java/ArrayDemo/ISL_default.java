package ArrayDemo;

public class ISL_default {
    static int a;
    int b;
    public static void main(String[] args) {
        System.out.println(a); //0  -> Default value for static variable is 0
        ISL_default demo = new ISL_default();
        demo.taxi();
    }

    public void taxi(){
        System.out.println(b);  //Default value for instance variable is 0
    }
}
