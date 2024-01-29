package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Set_1 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter input:");
        String[] name = new String[size];
        String[] name1 = new String[size];


        for(i=0;i<name.length;i++){
            name[i]=sc.next();
        }
        System.out.println(Arrays.toString(name));

        boolean flag = false;
        int temp =0;

        for(i=0;i<name.length;i++){

            for(j=i+1;j<name.length;j++){
                if(name[i].equals(name[j])){
                    name1[i]=name[i];
                    flag = true;
                    System.out.println("Duplicate found "+name[i]);
                    temp++;
                    break;
                }
            }
        }
        String[] name3 = new String[temp];
        int count =0;
        for(String a:name1){
            if(a!=null){
                name3[count] = a;
                count++;
            }
        }
        if(flag==true){
            System.out.println(Arrays.toString(name3));
        }
        if(flag==false){
            System.out.println("No duplicates are found");
        }
    }
}
