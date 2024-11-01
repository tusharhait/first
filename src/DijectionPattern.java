import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijectionPattern {

    public static void main(String args[] ) throws Exception {
        List<String> input = List.of("fge","plz","mee","bkk","san");
        String pattern = "azz";
        List<String> output = new ArrayList<>();
        for(String a : input){
            if(DijectionPattern.patternMatch(a,pattern)){
                output.add(a);
            }
        }
        output.forEach(System.out::println);
    }

    private static boolean patternMatch(String a, String pattern) {
        if(a.length()!=pattern.length()){
            return false;
        }
        Map<Character, Character> sToPattern = new HashMap<>();
        Map<Character, Character> pToS = new HashMap<>();
        for(int i =0;i<a.length();i++){
            char s = a.charAt(i);
            char w = pattern.charAt(i);
            if(!sToPattern.containsKey(s)){
                sToPattern.put(s,w);
            }else if(sToPattern.get(s)!=w){
                return false;
            }
            if(!pToS.containsKey(w)){
                pToS.put(w,s);
            }else if(pToS.get(w)!=s){
                return false;
            }
        }
        return true;
    }
}
