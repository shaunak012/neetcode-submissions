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
            HashSet<Integer> comps =new HashSet<>();
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target= -nums[i];
            for(int j=i+1;j<n;j++){
                int comp=target-nums[j];
                if(comps.contains(comp)){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(comp);
                    temp.add(nums[j]);
                    ans.add(temp);
                }
                comps.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}
