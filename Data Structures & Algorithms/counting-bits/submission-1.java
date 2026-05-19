class Solution {
    int[] dp;
    public int[] countBits(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,0);
        for(int i=1;i<=n;i++){
            dp[i]=1+dp[i&i-1];
        }
        return dp;
    }
}
