class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int min=nums[l];
        while(l<=r){
            if(nums[l]<nums[r]) return nums[l]<min?nums[l]:min;
            int mid=l+(r-l)/2;
            min=nums[mid]<min?nums[mid]:min;
            if(nums[mid]>=nums[l]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return min;
    }
}
