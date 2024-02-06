package Questions_04thFeb;


import java.util.Arrays;
import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.nextLine();
        name = name.toLowerCase();
        int vowelcount =0;
        int consonentcount =0;
        char[] char1 = name.toCharArray();
        for(char char2:char1){
            System.out.print(char2+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(char1));
        for(int i=0;i<char1.length;i++){
            if(char1[i]>='a' && char1[i]<='z'){
                if(char1[i]=='a' || char1[i]=='e' || char1[i]=='i' || char1[i]=='o' || char1[i]=='u'){
                    vowelcount++;
                }
                else{
                    consonentcount++;
                }
            }
        }
        System.out.println(vowelcount);
        System.out.println(consonentcount);
    }
}
