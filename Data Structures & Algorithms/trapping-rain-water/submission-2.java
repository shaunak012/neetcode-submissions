class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int sum=0;
        int start=0;
        int end=n-1;
        while(start<end){
            while(end-1>=0 && height[end-1]>=height[end])end--;
            while(start+1<n && height[start+1]>=height[start])start++;
            int min=height[start]<=height[end]?start:end;

            if(min==start){
                while(start+1<n && start+1<end && height[start+1]<height[min]){
                    start++;
                    sum+=height[min]-height[start];
                }
            }else{
                System.out.println("End");
                while(end-1>=0 && start<end-1 && height[end-1]<height[min]){
                    end--;
                    sum+=height[min]-height[end];
                }
                System.out.println("Sum:"+sum);
            }
        }
        return sum;
    }
}
