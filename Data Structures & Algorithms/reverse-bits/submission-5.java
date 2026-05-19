class Solution {
    public int reverseBits(int n) {
        int ans=0;
        int i=32;
        while(i--!=0){
            ans=(ans<<1);
            ans=ans+(n&1);
            n=n>>1;
        }
        return ans;
    }
}
