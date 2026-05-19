class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        dp[n-1]=cost[n-1];
        dp[n-2]=cost[n-2];
        for(int i=n-3;i>=0;i--){
            dp[i]=dp[i+1]<dp[i+2]?dp[i+1]:dp[i+2];
            dp[i]=dp[i]+cost[i];
        }
        return dp[0]<dp[1]?dp[0]:dp[1];
    }
}
