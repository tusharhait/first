import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> sMap= new HashMap<>();
        char[] sArray = s.toCharArray();
        for(int i = 0; i<sArray.length; i++){
            if(sMap.containsKey(sArray[i])){
                sMap.put(sArray[i],sMap.get(sArray[i])+1);
            }else{
                sMap.put(sArray[i],1);
            }
        }
        char[] tArray= t.toCharArray();
        for(int j = 0; j<tArray.length;j++){
            if(sMap.containsKey(tArray[j])){
                sMap.put(tArray[j],sMap.get(tArray[j])-1);
                if(sMap.get(tArray[j])==0){
                    sMap.remove(tArray[j]);
                }
            }
        }
        if(sMap.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first string");
        String s = scanner.nextLine();
        System.out.println("Second String");
        String t = scanner.nextLine();
        System.out.println(Anagram.isAnagram(s,t));
    }
}
