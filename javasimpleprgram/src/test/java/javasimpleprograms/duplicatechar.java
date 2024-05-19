package javasimpleprograms;

import java.util.HashMap;
import java.util.Map;

public class duplicatechar {

    public static void main(String[] args) {
        String s1="ajshbvsdsssssgjejeje";
        Map<String,Integer> chr=new HashMap<String,Integer>();
        for (int i = 0; i < s1.length(); i++) {
            char c=s1.charAt(i);
            if(chr.containsKey(String.valueOf(c))==false){
                chr.put(String.valueOf(c), 1);
            }else{
                if(chr.get(String.valueOf(c))==1){
                    System.out.println(c);
                }
                chr.put(String.valueOf(c),chr.get(String.valueOf(c))+1);
            }
        }
        
    }
}
