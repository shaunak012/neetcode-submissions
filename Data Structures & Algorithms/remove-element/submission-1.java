class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            if(nums[end]==val){
                end--;
                continue;
            }
            if(nums[start]==val){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
            }
            start++;
        }
        return end+1;
    }
}