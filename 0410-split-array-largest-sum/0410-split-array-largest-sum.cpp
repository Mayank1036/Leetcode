class Solution {
public:

    int countpartition(vector<int> nums , int maxsum){ // Counts how many partitions are needed for a given maxSum
        int partition = 1; // at least one partition
        int subarraysum = 0; // curr sum = 0;
        for(int i=0 ; i<nums.size() ; i++){
            if(subarraysum + nums[i] <= maxsum){
                subarraysum += nums[i];
            }
            else{
                partition++;
                subarraysum = nums[i];
            }
        }
        return partition;
    }

    int splitArray(vector<int>& nums, int k) {
        long long low = *max_element(nums.begin() , nums.end());
        long long high = accumulate(nums.begin() , nums.end() , 0LL);
        while(low <= high){
            long long mid = low + (high - low) / 2;
            if(countpartition(nums , mid) <= k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
        
    }
};