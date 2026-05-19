class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int start=0;
        int end=0;
        int max=0;
        int ans=0;
        int[] arr=new int[26];
        for(;end<n;end++){
            arr[s.charAt(end)-'A']++;
            for(int i=0;i<26;i++){
                max=max<arr[i]?arr[i]:max;
            }
            if(end-start+1-max>k){
                arr[s.charAt(start)-'A']--;
                start++;

            }else{
                ans=end-start+1<ans?ans:end-start+1;
            }
        } 
        return ans;
    }
}
