class Solution {
public:
    int minMoves(vector<int>& nums) {
        int n= nums.size();
        int maxi = INT_MIN;
        int count = 0;
        for(int i=0 ;i<n ; i++){
            maxi = max(maxi,nums[i]);
        }
        for(int i=0 ;i<n ; i++){
            count += maxi - nums[i];
        }
        return count;
    }
};