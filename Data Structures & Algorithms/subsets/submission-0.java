class Solution {
    List<List<Integer>> ans;
    public void subsetsHelper(List<Integer> list,int[] nums, int k) {
        int n=nums.length;
        if(k==n) return;
        for(int i=k;i<n;i++){
            list.add(nums[i]);
            ans.add(new ArrayList<>(list));
            subsetsHelper(list, nums,i+1);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        ans=new ArrayList<>();
        ans.add(list);
        subsetsHelper(list, nums,0);
        return ans;
    }
}
