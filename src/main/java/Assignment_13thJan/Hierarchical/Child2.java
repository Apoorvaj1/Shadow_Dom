package Assignment_13thJan.Hierarchical;

public class Child2 extends ParentH{
    public int loan(int l){
        System.out.println("Child 2 will also pay");
        return l;
    }

    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.loan(1000);
        ParentH p = new ParentH();
        p.loan(100);
        ParentH p1 = new Child1();
        p1.loan(100);
        ParentH p2 = new Child2();
        p2.loan(10000);
    }
}
