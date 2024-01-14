package Protected.Criminal;

import Protected.Police.Cop;

public class Thief extends Cop {
    public static void main(String[] args) {
        Cop a1 = new Cop(10);
        System.out.println(a1.Cop_name);
        Thief a2 = new Thief();
        a2.isShoot();

    }
}
