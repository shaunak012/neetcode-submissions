class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int[] ans=new int[n-k+1];
        Deque<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.println(i);
            while(!queue.isEmpty() && queue.peek()<=(i-k)) {
                System.out.println(nums[queue.peek()]+", " +queue.poll());
            }
            if(!queue.isEmpty() && nums[queue.peekLast()]<=nums[i]){
                while(!queue.isEmpty() && nums[queue.peekLast()]<nums[i]){
                    System.out.println(nums[queue.peek()]+", " +queue.pollLast()); 
                }
            }
            queue.addLast(i);
            if(i>=k-1){
                ans[l++]=nums[queue.peek()];
            }
        }
        return ans;
    }

}
