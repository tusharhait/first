import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSequence {

    public static void main(String[] args) {
        int[] input = new int[]{0,3,7,2,5,8,4,6,0,1};
        LongestSequence longestSequence = new LongestSequence();
        System.out.println(longestSequence.longestConsecutive(input));
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> integerSet = new HashSet<>();
        for(int i:nums){
            integerSet.add(i);
        }
        int longest=1;
        for(int i : nums){
            int cnt =1;
            int x = i;
            if(!integerSet.contains(x-1)){
                while(integerSet.contains(x+1)){
                    x=x+1;
                    cnt++;
                }
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}
