class Solution {
    int[] dp;
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return robHelper(nums,0);
    }
    public int robHelper(int[] nums, int index) {
        if(index>=nums.length) return 0;
        if(dp[index]!=-1) return dp[index];
        dp[index] = Math.max(nums[index]+robHelper(nums,index+2),robHelper(nums,index+1));
        return dp[index];
    }
}
