class Solution {
    public int findMin(int[] nums) {
        int low = 0 ;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                ans = Math.min(ans , nums[mid]);
                low++;
                high--;
            }

            else if(nums[low] <= nums[mid]){ //check for left portion
                ans = Math.min(ans , nums[low]);
                low = mid + 1;           // adter checking we move to right portion
            }
            else{                      //check for right portion
                ans = Math.min(ans , nums[mid]);
                high = mid - 1;         // after checking we move to left portion
            }
        }
        return ans;
        
    }
}