package LAB;

public class Continue1 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.println("Value is "+i);
                continue;
            }
            System.out.println(i);
        }
    }
}
