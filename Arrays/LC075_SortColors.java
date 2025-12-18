class Solution {
    public void sortColors(int[] nums) {
        int cnt1=0,cnt2=0,cnt3=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i]==0) cnt1++;
            else if (nums[i]==1) cnt2++;
            else cnt3++;
        }
        int j=0;
        while(cnt1>0) {
            nums[j++]=0;
            cnt1--;
        }
        while(cnt2>0) {
            nums[j++]=1;
            cnt2--;
        }
        while(cnt3>0) {
            nums[j++]=2;
            cnt3--;
        }
    }
}
