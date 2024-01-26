package AutomationTesterProgram_30thdec;

import java.util.Arrays;
import java.util.Scanner;

public class Program_22nd {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter input");
        int[] arr = new int[size];
        int[] arr4 = new int[size];
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        boolean flag = false;
        int temp = 0;

        for(i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=0){
                    flag=true;
                    arr4[i]=arr[i];
                    System.out.println("Duplicate found: "+arr[i]);
                    temp++;
                    break;
                }
            }
        }
        int[] arr5 = new int[temp];
        int count=0;
        for(int a:arr4){
            if(a!=0){
                arr5[count]=a;
                count++;
            }
        }

        if(flag==true){
                    System.out.println("Duplicate element now present in this array");
                    System.out.println(Arrays.toString(arr5));

        }
        if(flag==false){
            System.out.println("No duplicate found");
        }
    }
}
