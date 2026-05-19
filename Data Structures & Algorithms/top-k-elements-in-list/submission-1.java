class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int[] freq=new int[n];
        Arrays.fill(freq,0);
        for(int i=0;i<n;i++){
            if(freq[i]==-1) continue;
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]){
                    freq[i]++;
                    freq[j]=-1;
                }
            }
        }
        int[] ans=new int[k];
        Arrays.fill(ans,0);
        for(int i=0;i<k;i++){
            int max=-1;
            int index=0;
            for(int j=0;j<n;j++){
                if(freq[j]>max){
                    max=freq[j];
                    index=j;
                }
            }
            ans[i]=nums[index];
            freq[index]=-1;
        }
        return ans;
    }
}
