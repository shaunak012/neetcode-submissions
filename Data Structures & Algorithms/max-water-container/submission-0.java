class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int start=0;
        int end=n-1;
        int vol=0;
        while(start<end){
            int min=heights[start]<heights[end]?start:end;
            int temp_vol=(end-start)*heights[min];
            vol=temp_vol<=vol?vol:temp_vol;
            if(heights[min]==heights[start]) start++;
            else end--;
        }
        return vol;
    }
}
