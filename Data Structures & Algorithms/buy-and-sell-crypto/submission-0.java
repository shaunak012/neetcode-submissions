class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int left=0;
        int right=1;
        int max=0;
        while(right<n){
            if(prices[left]>prices[right]){
                left=right;
            }else{
                max=prices[right]-prices[left]<max?max:prices[right]-prices[left];
            }
            right++;
        }
        return max;
    }
}
