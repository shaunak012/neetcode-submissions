class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            String temp=checkPalindrome(s,i,i);
            if(temp.length()>ans.length()) ans=temp;
            temp=checkPalindrome(s,i,i+1);
            if(temp.length()>ans.length()) ans=temp;
        }
        return ans;
    }
    public String checkPalindrome(String s,int left,int right) {
        String ans="";
        int n=s.length();
        if(right==n) return "";
        while(s.charAt(left)==s.charAt(right)){
            ans=s.substring(left,right+1);
            left--;
            right++;
            if(left<0 || right>=n) break;
        }
        return ans;
    }
}
