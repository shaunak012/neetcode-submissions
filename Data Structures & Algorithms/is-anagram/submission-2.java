class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] arr1=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);
            arr1[ch-'a']+=1;
            arr1[ch2-'a']-=1;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0) return false;
        }

        return true;
    }
}
