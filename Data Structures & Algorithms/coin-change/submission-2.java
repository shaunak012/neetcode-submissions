class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] ans=new int[amount+1];
        Arrays.fill(ans,amount+1);
        ans[0]=0;        
        for(int i=1;i<=amount;i++){
            for(int j=0;j<n;j++){
                if(i>=coins[j]){
                    ans[i]=ans[i]<(1+ans[i-coins[j]])?ans[i]:1+ans[i-coins[j]];
                }
            }
        }
        // for(int i=0;i<amount+1;i++){
        //     System.out.println(i+"   :   "+ans[i]);
        // }
        if(ans[amount]<amount+1) return ans[amount];
        return -1;
    }
}
