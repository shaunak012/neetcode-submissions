class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> num=new HashSet<>();
        for(int i=0;i<n;i++){
            num.add(nums[i]);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int temp=1;
            int prev=nums[i];
            int next=nums[i];
            while(num.contains(prev-1)){
                prev-=1;
                temp++;
            }
            while(num.contains(next+1)){
                next+=1;
                temp++;
            }
            if(temp>max) max=temp;
        }
        return max;
    }
}
