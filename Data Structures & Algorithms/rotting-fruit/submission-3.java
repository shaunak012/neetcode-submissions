class Solution {
    public int orangesRotting(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        Queue<Integer> q = new ArrayDeque<>();
        int max=2;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==2){
                    q.add(i*n+j);
                }
            }
        }
        while(!q.isEmpty()){
            int temp=q.poll();
            int temp_i=temp/n;
            int temp_j=temp%n;
            if(temp_i>0 && arr[temp_i-1][temp_j]==1) {
                arr[temp_i-1][temp_j]=arr[temp_i][temp_j]+1;
                temp=(temp_i-1)*m+temp_j;
                q.add(temp);
            }
            if(temp_i<m-1 && arr[temp_i+1][temp_j]==1){
                arr[temp_i+1][temp_j]=arr[temp_i][temp_j]+1;
                temp=(temp_i+1)*m+temp_j;
                q.add(temp);
            }
            if(temp_j>0 && arr[temp_i][temp_j-1]==1) {
                arr[temp_i][temp_j-1]=arr[temp_i][temp_j]+1;
                temp=temp_i*m+temp_j-1;
                q.add(temp);
            }
            if(temp_j<n-1 && arr[temp_i][temp_j+1]==1){
                arr[temp_i][temp_j+1]=arr[temp_i][temp_j]+1;
                temp=temp_i*m+temp_j+1;
                q.add(temp);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1) return -1;
                if(arr[i][j]>max) max=arr[i][j];
                System.out.print(arr[i][j]+",");
            }
            System.out.println();
        }
        return max-2;
    }
}
