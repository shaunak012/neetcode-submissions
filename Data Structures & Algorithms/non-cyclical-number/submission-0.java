class Solution {
    Set<Integer> set;
    public boolean isHappy(int n) {
        set=new HashSet<>();
        return isHappyHelper(n);
    }
    public boolean isHappyHelper(int n) {
        int sum=0;
        int temp=n;
        while(temp!=0){
            int x=temp%10;
            x=x*x;
            sum=sum+x;
            System.out.print(x+",");
            temp=temp/10;
        }
        if(sum==1) return true;
        if(set.contains(sum)) return false;
        set.add(sum);
        return isHappyHelper(sum);
    }
}
