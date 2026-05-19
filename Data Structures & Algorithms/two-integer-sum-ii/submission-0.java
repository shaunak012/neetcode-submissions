class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> comps=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<numbers.length;i++){
            int comp=target-numbers[i];
            if(!comps.containsKey(comp)){
                comps.put(numbers[i],i);
            }else{
                ans[0]=comps.get(comp)+1;
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
