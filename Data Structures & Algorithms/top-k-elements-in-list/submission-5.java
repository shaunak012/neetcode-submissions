class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[] arr=new ArrayList[n+1];
        int[] ans=new int[k];
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            if (arr[frequency] == null) {
                arr[frequency] = new ArrayList<>();
            }
            arr[frequency].add(element);
        }
        int idx = 0;
        for(int i=n;i>=0;i--){
            if(arr[i]==null) continue;
            int size=arr[i].size();
            while (size-->0 && idx<k){
                ans[idx++]=arr[i].get(size);
            }
        }
        return ans;
    }
}
