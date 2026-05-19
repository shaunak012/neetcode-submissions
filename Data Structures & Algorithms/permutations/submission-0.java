class Solution {
    List<List<Integer>> ans;
    public void permuteHelper(List<Integer> list,int[] nums, int[] freq) {
        int n=nums.length;
        if(list.size()==n) ans.add(new ArrayList<>(list));
        for(int i=0;i<n;i++){
            if(freq[i]==0){
                freq[i]=-1;
                list.add(nums[i]);
                permuteHelper(list,nums,freq);
                list.remove(list.size()-1);
                freq[i]=0;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        ans=new ArrayList<>();
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        permuteHelper(list,nums,arr);
        return ans;
    }
}
