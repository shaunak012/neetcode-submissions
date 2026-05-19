class Solution {
    int dp[];
    public int climbStairs(int n) {
        if(n<=1) return n;
        dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++) dp[i]=-1;
        return climbStairsHelper(n);
    }
    public int climbStairsHelper(int n) {
        if(dp[n]!=-1) return dp[n];
        dp[n]= climbStairsHelper(n-1)+climbStairsHelper(n-2);
        return dp[n];
    }
}
