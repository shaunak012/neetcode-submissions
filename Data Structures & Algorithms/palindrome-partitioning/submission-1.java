class Solution {
    List<List<String>> ans;
    List<String> list;
    public boolean pallinderome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false;
        return true;
    }
    public void partitionHelper(String s,int l) {
        if(l==s.length()) ans.add(new ArrayList<>(list));
        for(int j=l;j<s.length();j++){
            String sub=s.substring(l,j+1);
            if(pallinderome(sub)) {
                list.add(sub);
                partitionHelper(s,j+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        ans=new ArrayList<>();
        list=new ArrayList<>();
        for(int j=0;j<s.length();j++){
            String sub=s.substring(0,j+1);
            if(pallinderome(sub)) {
                list.add(sub);
                partitionHelper(s,j+1);
                list.remove(list.size()-1);
            }
        }
        return ans;
    }
}
