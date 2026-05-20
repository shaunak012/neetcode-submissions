class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> generate(int n) {
        for(int i=0;i<n;i++){
            ans.add(tri(i+1));
        }
        return ans;
    }
    public List<Integer> tri(int n){
        List<Integer> a=new ArrayList<>();
        int len=ans.size();
        a.add(1);
        if(n==1) return a;
        for(int i=1;i<n-1;i++){
            a.add(ans.get(len-1).get(i-1)+ans.get(len-1).get(i));
        }
        a.add(1);
        return a;
    }
}