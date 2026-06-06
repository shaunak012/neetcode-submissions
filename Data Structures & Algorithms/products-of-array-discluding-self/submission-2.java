class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int product=1;
        int zeros=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeros++;
            }else{
                product=product*nums[i];
            }
        }
        int[] ans=new int[n];
        if(zeros>1) return ans;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i]=product;
            }
            if(zeros==0){
                ans[i]=product/nums[i];
            }
        }
        return ans;
    }
}  
