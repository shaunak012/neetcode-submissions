class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[] total=new double[n];
        int count=n;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(position[i]>position[j]){
                    swap(position,i,j);
                    swap(speed,i,j);
                }
            }
        }

        for(int i=0;i<n;i++){
            total[i]=((target-position[i])/(double)speed[i]);
            System.out.print(total[i]+",");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && total[i]>=total[stk.peek()]){
                count--;
                stk.pop();
            }
            System.out.print(count+",");
            stk.push(i);
        }
        return count;
    }
    public void swap(int[] arr,int i,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}
