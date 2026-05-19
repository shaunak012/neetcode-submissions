class Solution {
    List<List<Integer>> ans;
    public void combinationSumHelper(List<Integer> list,int[] nums, int k,int target) {
        int n=nums.length;
        if(target==0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return;
        for(int i=k;i<n;i++){
            list.add(nums[i]);
            combinationSumHelper(list,nums,i,target-nums[i]);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        ans=new ArrayList<>();
        combinationSumHelper(list, nums,0,target);
        return ans;
    }
}
