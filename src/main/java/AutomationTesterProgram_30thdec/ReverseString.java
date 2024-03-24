package AutomationTesterProgram_30thdec;

public class ReverseString {
    public static void main(String[] args) {
        String[] name = {"Apoorv"};
        System.out.println(name.length);  // Array -> length
        System.out.println(name[0].length()); // String -> length()

        String a1 = "Apoorv";
        char[] a2 = a1.toCharArray();
        System.out.println(a2.length);
        for(int i=0;i<a2.length;i++){
            System.out.println(a2[i]);
        }

        for(char a3:a2){
            System.out.print(a3);
        }
        System.out.println();

    }
}
