class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            ans = ans + checkPalindrome(s,i,i) + checkPalindrome(s,i,i+1);
        }
        return ans;
    }
    public int checkPalindrome(String s,int left,int right) {
        int n=s.length();
        if(right==n) return 0;
        int count=0;
        while(s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
            if(left<0 || right>=n) break;
        }
        return count;
    }
}
