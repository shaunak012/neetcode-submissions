class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i],0);
            }
            freq.put(nums[i],freq.get(nums[i])+1);
        }
        Queue<Integer> pq = new PriorityQueue<>((a,b)-> freq.get(a)-freq.get(b));
        for(int x: freq.keySet()){
            pq.add(x);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}
