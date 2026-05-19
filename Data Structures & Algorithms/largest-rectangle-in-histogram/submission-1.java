class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stk=new Stack<>();
        int max=0;
        for(int i=0;i<=n;i++){
            int cur=i==n?0:heights[i];
            while(!stk.isEmpty() && heights[stk.peek()]>cur){
                int len=heights[stk.pop()];
                int width=stk.isEmpty()?i:i-1-stk.peek();
                max=max<len*width?len*width:max;
            }
            stk.push(i);
        }
        return max;
    }
}
