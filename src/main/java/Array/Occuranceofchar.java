package Array;

import java.util.HashMap;
import java.util.Map;

public class Occuranceofchar {
    public static void main(String[] args){

        String name = "Apoorv";
        char ch[] = name.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
