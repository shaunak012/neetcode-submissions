class Solution {
    List<Integer> list;
    List<List<String>> ans;
    public void convertNAdd() {
        List<String> temp=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String str="";
            for(int j=0;j<list.get(i);j++){
                str+=".";
            }
            str+="Q";
            while(str.length()<list.size()) str+=".";
            temp.add(str);
        }
        ans.add(temp);
    }
    public boolean valid(int num){
        if(list.size()==0) return true;
        int n=list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)==num) return false;
            if(list.get(i)+n-i==num || list.get(i)-n+i==num) return false;
        }
        return true;
    }
    public void solveNQueensHelper(int n,int j) {
        if(j==n) {
            convertNAdd();
            return;
        }
        for(int i=0;i<n;i++){
            if(valid(i)){
                list.add(i);
                solveNQueensHelper(n,j+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        list=new ArrayList<>();
        ans=new ArrayList<>();
        solveNQueensHelper(n,0);
        
        return ans;
    }
}
