import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] input = new int[]{-2,-1,2,2,-2,-1,-1,0,2,0,2,0,2};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> res = threeSum.threeSum(input);
        System.out.println(res);

    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int N = nums.length;
        List<List<Integer>> results= new ArrayList<>();
        for(int i =0; i<N-2;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int j = i+1;
            int k = N-1;
            while(j<k){
                System.out.println("in loop");
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    results.add(List.of(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return results;
    }
}
