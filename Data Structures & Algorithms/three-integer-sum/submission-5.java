class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+",");
        }
        int prev_i=0,prev_j=0,prev_k=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target=-nums[i];
            int start=i+1;
            int end=n-1;
            while(start<end){
                int sum=nums[start]+nums[end];
                if(sum==target){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    ans.add(temp);
                    while(start+1<n && nums[start+1]==nums[start++]);
                    while(end-1>=0 && nums[end-1]==nums[end--]);
                }
                else if(sum>target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
