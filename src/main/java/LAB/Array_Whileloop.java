package LAB;

public class Array_Whileloop {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;
        a[3] = 13;
        a[4] = 14;
        int i=0;
        while(i<a.length){
            System.out.println(a[i]);
            i++;
        }
    }
}
