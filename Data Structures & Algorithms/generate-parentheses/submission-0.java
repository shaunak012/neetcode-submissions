class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(ans,new StringBuilder(),0,0,n);
        return ans;
    }
    public void helper(List<String> ans,StringBuilder cur,int open,int close,int max){
        if(cur.length()==max*2) {
            ans.add(cur.toString());
            return;
        }
        if(open<max){
            cur.append("(");
            helper(ans,cur,open+1,close,max);
            cur.deleteCharAt(cur.length()-1);
        }
        if(close<open){
            cur.append(")");
            helper(ans,cur,open,close+1,max);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}
