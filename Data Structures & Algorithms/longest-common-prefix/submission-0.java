class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String pre=strs[0];
        for(int i=1;i<n;i++){
            pre=common(pre,strs[i]);
        }
        return pre;
    }
    public String common(String str1,String str2){
        int n=Math.min(str1.length(),str2.length());
        int p=0;
        String ans="";
        while(p<n){
            if(str1.charAt(p)==str2.charAt(p)){
                ans+=str1.charAt(p++);
            }else{
                break;
            }
        }
        return ans;
    }
}