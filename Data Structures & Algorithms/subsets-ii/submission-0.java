class Solution {
    List<List<Integer>> ans;
    public void subsetsWithDupHelper(List<Integer> list,int[] nums, int k) {
        int n=nums.length;
        if(k==n) return;
        for(int i=k;i<n;i++){
            if(i>k && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            ans.add(new ArrayList<>(list));
            subsetsWithDupHelper(list, nums,i+1);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list=new ArrayList<>();
        ans=new ArrayList<>();
        Arrays.sort(nums);
        ans.add(list);
        subsetsWithDupHelper(list, nums,0);
        return ans;
    }
}
