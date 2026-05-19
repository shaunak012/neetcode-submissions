class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zeros=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeros++;
            }
            else{
                product*=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(zeros>1){
                nums[i]=0;
                continue;
            }
            else if(zeros==1){
                if(nums[i]==0){
                    nums[i]=product;
                    continue;
                }
                nums[i]=0;
            }
            else{
                nums[i]=product/nums[i];
            }
        }
        return nums;
    }
}  
