package Protected.Police;

public class JuniorCop extends Cop{
    public void isShoot(){
        System.out.println("Junior will shoot");
    }
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        cop.isShoot();
        System.out.println(cop.gun);
        JuniorCop junior = new JuniorCop();
        System.out.println(junior.gun);
        junior.isShoot();
        cop.isShoot();
        Cop cop2 = new JuniorCop();
        cop2.isShoot();
    }


}
