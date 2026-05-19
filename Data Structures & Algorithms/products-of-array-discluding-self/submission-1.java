class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int n=nums.length;
        int[] prefix=new int[n];
        int[] sufix=new int[n];
        Arrays.fill(prefix,1);
        Arrays.fill(sufix,1);
        for(int i=0;i<n;i++){
            prefix[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            sufix[i]=product;
            product*=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=prefix[i]*sufix[i];
        }
        return nums;
    }
}  
