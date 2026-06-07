class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i]-1)) continue;
            int temp=0;
            while(set.contains(nums[i]+temp)){
                temp++;
            }
            max=Math.max(temp,max);
        }
        return max;
    }
}
