class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        return sum%2==0 && sum(0,nums,sum/2);
    }
    public boolean sum(int i,int[] nums,int target){
        if(target<0 || i==nums.length) return false;
        if(target==0) return true;
        return  sum(i+1,nums,target) || sum(i+1,nums,target-nums[i]);
    }
}
