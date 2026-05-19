class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int islands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]-'0'==1){
                    islands++;
                    removeOne(grid,i,j);
                }
            }
        }
        return islands;
    }
    public void removeOne(char[][] arr, int i, int j){
        arr[i][j]=0;
        int m=arr.length;
        int n=arr[0].length;
        if(i>0 && arr[i-1][j]-'0'==1) removeOne(arr,i-1,j);
        if(i<m-1 && arr[i+1][j]-'0'==1) removeOne(arr,i+1,j);
        if(j>0 && arr[i][j-1]-'0'==1) removeOne(arr,i,j-1);
        if(j<n-1 && arr[i][j+1]-'0'==1) removeOne(arr,i,j+1);
    }
}
