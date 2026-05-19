class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        int l=1;
        for(int i:piles) max=i>max?i:max;
        int r=max;
        while(l<r){
            int rate=l+(r-l)/2;
            if(valid(piles,rate,h)){
                r=rate;
            }else{
                l=rate+1;
            }
        }
        return r;
    }
    public boolean valid(int[] nums,int rate,int h){
        int hours=0;
        for(int i=0;i<nums.length;i++){
            hours+=nums[i]/rate;
            hours+=nums[i]%rate!=0?1:0;
        }
        return hours<=h;
    }
}
