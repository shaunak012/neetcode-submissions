class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int temp=count(grid,i,j);
                    max=max>temp?max:temp;
                }
            }
        }
        return max;
    }
    public int count(int[][] arr, int i, int j){
        int temp=1;
        arr[i][j]=0;
        int m=arr.length;
        int n=arr[0].length;
        if(i>0 && arr[i-1][j]-0==1) temp+=count(arr,i-1,j);
        if(i<m-1 && arr[i+1][j]-0==1) temp+=count(arr,i+1,j);
        if(j>0 && arr[i][j-1]-0==1) temp+=count(arr,i,j-1);
        if(j<n-1 && arr[i][j+1]-0==1) temp+=count(arr,i,j+1);
        return temp;
    }
}
