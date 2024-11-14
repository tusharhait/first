public class RotatedSearch {
    public static void main(String[] args){
        int target = 0;
        int[] input = new int[]{1,0,1,1,1};
        RotatedSearch rotatedSearch= new RotatedSearch();
        System.out.println(rotatedSearch.search(input,target));
    }
    public int search1(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public boolean search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
