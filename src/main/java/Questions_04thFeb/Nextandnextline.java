package Questions_04thFeb;

import java.util.Scanner;

public class Nextandnextline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String name = sc.nextLine();  // returns tokenized text
        System.out.println(name);
        /*String name1 = sc.nextLine();  //returns all the text up to line breaks
        System.out.println(name1);*/
    }
}
