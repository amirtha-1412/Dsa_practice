class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++) {
            if (curr<0) {
                curr=nums[i];   
            } else {
                curr+=nums[i];  
            }
            if (curr>ans) {
                ans=curr;
            }
        }
        return ans;
    }
}

