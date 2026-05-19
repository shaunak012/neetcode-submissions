class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        Arrays.fill(dp,false);
        dp[0]=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(dp[j]==true && wordDict.contains(s.substring(j,i+1))){
                    dp[i+1]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
