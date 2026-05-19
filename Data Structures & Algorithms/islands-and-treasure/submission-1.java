class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    addOne(grid,i,j,0);
                }
            }
        }
    }
    public void addOne(int[][] arr, int i, int j,int count){
        if(count>arr[i][j]) return;
        int m=arr.length;
        int n=arr[0].length;
        arr[i][j]=count++;
        if(i>0 && arr[i-1][j]>0){
            addOne(arr,i-1,j,count);
        }
        if(i<m-1 && arr[i+1][j]>0){
            addOne(arr,i+1,j,count);
        }
        if(j>0 && arr[i][j-1]>0){
            addOne(arr,i,j-1,count);
        }
        if(j<n-1 && arr[i][j+1]>0){
            addOne(arr,i,j+1,count);
        }
    }

    public void printArr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
