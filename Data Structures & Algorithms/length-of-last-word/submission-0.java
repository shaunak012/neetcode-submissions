class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int len=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){
                len++;
            }else if(len!=0){
                ans=len;
                len=0;
            }
        }
        return len==0?ans:len;
    }
}