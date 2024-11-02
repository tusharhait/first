import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Morgan {
    public static void main(String[] args){
        int target = 6;
        int[] input = new int[]{3,3};
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
            int diff = target - input[i];
            if(integerHashMap.containsKey(diff)){
                System.out.println(i+"-"+integerHashMap.get(diff));
                break;
            }
            integerHashMap.put(input[i],i);
        }
        Morgan.t2Pointer(input,target);
    }

    public static void t2Pointer(int[] input, int target){
        Arrays.sort(input);
        int i = 0;
        int j = input.length-1;
        while(i<j){
            int sum = input[i]+input[j];
            if(sum==target){
                System.out.println(i+"-"+j);
                break;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("NO");
    }
}
