class Solution {
public:

    int atMost(vector<int> nums , int k){ // when not sure about shrink or expend use this AtMost (k) - (k-1) to get exact ==k
        if( k < 0) return 0;
        int n= nums.size();
        int l = 0;
        int r = 0;
        int count = 0;
        unordered_map<int,int> mpp;
        while( r < n){
            mpp[nums[r]]++;
            while(mpp.size() > k){
                mpp[nums[l]]--;
                if(mpp[nums[l]] == 0) mpp.erase(nums[l]); l++;
            }
            count = count + (r - l + 1);
            r++;
        }
        return count;
    }

    int subarraysWithKDistinct(vector<int>& nums, int k) {
        return atMost(nums , k) - atMost(nums , k-1);
    }
};



        // int count = 0;  // will Give TLE
        // for(int i=0 ; i<nums.size() ; i++){
        //     unordered_map<int,int> map;
        //     for(int j=i ; j<nums.size() ;j++){
        //         map[nums[j]]++;
        //         if(map.size() == k) count++;
        //         if(map.size() > k) break;
        //     }
        // }
        // return count;  