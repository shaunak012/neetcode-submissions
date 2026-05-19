class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char s_ch=s.charAt(start);
            char e_ch=s.charAt(end);
            if((s_ch-'a'>=26 || s_ch-'a'<0) && (s_ch-'0'>=9 || s_ch-'0'<0)) {
                start++;
            }
            else if((e_ch-'a'>26 || e_ch-'a'<0) && (e_ch-'0'>=9 || e_ch-'0'<0)){
                end--;
            }
            else if(s_ch!=e_ch) {
                return false;
            }
            else {
                start++;
                end--;
            }
            
        }
        return true;
    }
}
