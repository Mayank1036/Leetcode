class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == target) ans.add(i);
        }
        return ans;
    }
}
        // int smaller = 0;
        // int equal = 0;

        // for(int i=0 ;i<nums.length ; i++){
        //     if(nums[i] < target){
        //         smaller++;
        //     }
        //     if(nums[i] == target){
        //         equal++;
        //     }
        // }   

        // List<Integer> ans = new ArrayList<>();

        // for(int i=0 ;i<equal ; i++){
        //     ans.add(smaller + i);
        // }
        // return ans;