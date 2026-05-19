class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> num_set=new HashSet<>();
        for(int i=0;i<n;i++){
            num_set.add(nums[i]);
        }
        int max=0;
        for(int num:num_set){
            if(num_set.contains(num-1)) continue;
            int temp=0;
            int current=num;
            while(num_set.contains(current++)){
                temp++;
            }
            if(temp>max) max=temp;
        }
        return max;
    }
}
