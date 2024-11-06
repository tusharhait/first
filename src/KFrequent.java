import java.util.*;

public class KFrequent {
    public static void main(String[] args) {
        int target = 2;
        int[] input = new int[]{1,1,1,2,2,3};
        int[] result = KFrequent.topKFrequent(input,target);
        System.out.println(result);
        int[] input1 = new int[]{1,2,3,4};
        KFrequent kFrequent = new KFrequent();
        int[] sums= kFrequent.productExceptSelf(input1);
        System.out.println(sums);

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int i =0;i< nums.length;i++){
            if(count.containsKey(nums[i])){
                int c = count.get(nums[i]);
                count.put(nums[i],++c);
            }else{
                count.put(nums[i],1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> integerPriorityQueue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        int j =0;
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            integerPriorityQueue.add(entry);
            j++;
            if(j>k){
                integerPriorityQueue.poll();
            }
        }
        int[] result = new int[k];
        j=0;
        while(!integerPriorityQueue.isEmpty()){
            result[j]=integerPriorityQueue.poll().getKey();
            j++;
        }
        return result;
    }

    public int[] productExceptSelf(int[] nums) {
        int temp = 1;
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            result[i]=temp;
            temp=temp*nums[i];
        }
        temp=1;
        for(int i = nums.length-1;i>=0;i--){
            result[i]=temp*result[i];
            temp=temp*nums[i];
        }
        return result;
    }
}
