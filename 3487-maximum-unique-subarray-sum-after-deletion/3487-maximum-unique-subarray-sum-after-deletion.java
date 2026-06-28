class Solution {
    public int maxSum(int[] nums) {
        int sum = 0;
        int mx = Arrays.stream(nums).max().getAsInt();
        if(mx <= 0) return mx;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num>0 && !set.contains(num)){
                sum += num;
                set.add(num);
            }
        }
        return sum;

    }
}