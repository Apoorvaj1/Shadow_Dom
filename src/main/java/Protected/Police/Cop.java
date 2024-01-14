package Protected.Police;

public class Cop {
    public String Cop_name;
    int gun;
    public Cop(){

    }
    public Cop(int gun){
        this.gun=gun;
    }

    protected void isShoot(){
        System.out.println("Senior Cop will shoot");
    }
}
