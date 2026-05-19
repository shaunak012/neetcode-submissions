class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp=new int[n];
        dp[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            int max1=(i+2)<n?dp[i+2]:0;
            int max2=(i+3)<n?dp[i+3]:0;
            dp[i]=max1>max2?max1:max2;
            dp[i]=dp[i]+nums[i];
        }
        return dp[0]<dp[1]?dp[1]:dp[0];
    }
}
