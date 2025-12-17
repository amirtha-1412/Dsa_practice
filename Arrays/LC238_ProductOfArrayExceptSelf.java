class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a=nums.length;
        int[] res=new int[a];
        res[0]=1;
        for (int i=1;i<a;i++) {
            res[i]=res[i-1]*nums[i-1];
        }
        int b=1;
        for (int i=a-1;i>=0;i--) {
            res[i]=res[i]*b;
            b=b*nums[i];
        }
        return res;
    }
}
