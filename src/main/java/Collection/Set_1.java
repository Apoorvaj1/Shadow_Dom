package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Set_1 {
    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        String[] name = new String[size];
        System.out.println("Enter input:");
        for(int i=0;i<name.length;i++){
            name[i]=sc.next();
        }
        System.out.println(Arrays.toString(name));
        System.out.println("Duplicates");

        for(int i=0;i<name.length;i++){
            count=1;
            for(int j=i+1;j<name.length;j++){
                if(name[i]==name[j]){
                    count++;
                    System.out.println("Duplicate found "+name[i]+"\t"+count);
                    //flag=true;
                }
            }
        }
      /*  if(flag==false){
            System.out.println("No duplicates are found");
        }*/


        /*String[] name ={"Apoorv","Jain","Car","Apoorv"};
        HashSet<String> set1 = new HashSet<>();
        for(String l:name){
            System.out.println(set1.add(l));
        }*/
    }
}
