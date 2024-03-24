package Construtor_23rdmarch;

public class Practice_23rdmarch {
    int age = 10;

    public void test(){
        System.out.println(this.age);
    }
    public Practice_23rdmarch(String name){
        System.out.println("My name is "+name);
    }
    public Practice_23rdmarch(){

    }

}

class AG extends Practice_23rdmarch{
    int age = 100;

    public void test(){
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);

    }
    public AG(){
        super("Rahul");
        //this(30);
        System.out.println("Hello");
    }
    public AG(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        AG a = new AG();
        a.test();
        System.out.println("---------------------------");
        Practice_23rdmarch b = new Practice_23rdmarch();
        b.test();
        System.out.println("---------------------------");
        AG c = new AG(1000);
    }
}
