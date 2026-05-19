class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                if(i==0 || (s.charAt(i-1)!='1' && s.charAt(i-1)!='2')) return 0;
            }
        }
        return valid(s);
    }
    public int valid(String s){
        int n=s.length();
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)!='0') dp[i+1]=dp[i+1]+dp[i];
            if(s.charAt(i-1)=='1'|| ( s.charAt(i-1)=='2' && s.charAt(i)-'6'<=0)){
                dp[i+1]=dp[i+1]+dp[i-1];
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.print(dp[i]+",");
        }
        return dp[n];
    }
}
