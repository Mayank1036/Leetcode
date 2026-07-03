class Solution {
public:
    int atMost(vector<int> nums , int goal){
        int l = 0;
        int oddcount = 0;
        int count = 0;
        for(int r=0 ; r<nums.size() ; r++){
            if(nums[r] % 2 == 1) oddcount++;
            while( oddcount > goal){ // shrink the window
                if(nums[l]%2 == 1){
                    oddcount--;
                }
                l++;
            }
            count += r - l + 1;
            }
        return count;
    }

    int numberOfSubarrays(vector<int>& nums, int k) {
        return atMost(nums , k) - atMost(nums , k-1);
    }
};



    //     int count = 0; // will give TLE
    //     for(int i=0 ;i<nums.size() ;i++){
    //         int oddcount = 0;
    //         for(int j=i ;j<nums.size() ; j++){
    //             if(nums[j]%2 == 1) oddcount++;
    //             if(oddcount == k){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;