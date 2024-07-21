package AutomationTesterProgram;

public class Uppercase {
    public static void main(String[] args){
        String name = "Apoorv";
        StringBuilder stb = new StringBuilder();
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(Character.isLowerCase(ch)){
                stb.append(Character.toUpperCase(ch));
            }
            else{
                stb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(stb);

    }
}
