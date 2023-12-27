package AutomationTesterProgram;

import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        //String letter = sc.next();  // next() -> read any input till space.
        String letter = sc.nextLine(); // nextLine() -> read input along with space between two words.
        letter = letter.toLowerCase();
        int vowelCount = 0, consonantCount = 0;
        for(int i=0;i<letter.length();i++){
            char ch = letter.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }
        }
        System.out.println(vowelCount);
        System.out.println(consonantCount);

    }
}
