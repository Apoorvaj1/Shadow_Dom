package Array;

public class Break {
    public static void main(String[] args) {
        int[] a = {10,11,12,23,344,56};
        for(int i=0;i<a.length;i++){
            if(a[i]>15) {
                System.out.println("Hello1");
                break;
            }
            System.out.println("Hello");
        }
    }
}
