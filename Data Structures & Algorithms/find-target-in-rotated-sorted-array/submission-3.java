class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int max=0;
        int l=0;
        int r=n-1;
        while(l<=r){
            if(nums[l]<nums[r]){
                max=nums[r]>nums[max]?r:max;
            }
            int mid=l+(r-l)/2;
            max=nums[mid]>nums[max]?mid:max;
            if(nums[mid]>=nums[l]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        int ans=0;
        if(nums[0]<=target) ans=binary_search(nums,0,max,target);
        else ans=binary_search(nums,(max+1)%n,n-1,target);
        return ans;
    }
    public static int binary_search(int[] nums,int l,int r,int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}
