class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(isSubset(words[i],words[j])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
    public boolean isSubset(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        if(n1>n2) return false;
        int p1=0;
        int p2=0;
        while(p1<n1 && p2<n2){
            if(str1.charAt(p1)==str2.charAt(p2)){
                p1++;
            }else{
                p1=0;
            }
            p2++;
        }
        return p1==n1;
    }
}