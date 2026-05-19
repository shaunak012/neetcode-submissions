class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int mult=1;
        int max=nums[0];
        int flag=-1;
        for(int i=0;i<n;i++){
            mult=mult*nums[i];
            max=max>mult?max:mult;
            if(flag==-1 && mult<0){
                flag=i;
            }
            if(nums[i]==0 || i==n-1){
                mult=1;
                if(flag!=-1){
                    i=flag;
                    flag=-1;
                }
            }
        }
        return max;
    }
}
