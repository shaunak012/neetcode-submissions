class Solution {
    List<List<Integer>> ans;
    public void combinationSum2Helper(List<Integer> list,int[] nums, int k,int target) {
        int n=nums.length;
        if(target==0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return;
        for(int i=k;i<n;i++){
            if(i!=k && i!=0 && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            combinationSum2Helper(list,nums,i+1,target-nums[i]);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        ans=new ArrayList<>();
        Arrays.sort(candidates);
        for(int i:candidates) System.out.print(i+",");
        combinationSum2Helper(list, candidates,0,target);
        return ans;
    }
}
