import java.util.HashMap;

public class Morgan {
    public static void main(String[] args){
        int target = 11;
        int[] input = new int[]{3,1,6,4,2,5};
//        for(int i =0;i<input.length;i++){
//            for(int j = i+1; j<input.length;j++){
//                if(input[i]+input[j]==target){
//                    System.out.println(i + "-"+j);
//                    break;
//                }
//            }
//        }
        HashMap<Integer,Integer> integerHashMap = new HashMap<>();
        for(int i=0;i<input.length;i++){
            integerHashMap.put(input[i],i);
            int diff = target - input[i];
            if(integerHashMap.containsKey(diff)){
                System.out.println(i+"-"+integerHashMap.get(diff));
                break;
            }
        }
    }
}
