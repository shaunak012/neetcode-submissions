class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        int start=0;
        int end=0;
        int[] arr=new int[26];
        for(;end<n1;end++){
            arr[s1.charAt(end)-'a']++;
        }
        end=0;
        for(;end<n2;end++){
            arr[s2.charAt(end)-'a']--;
            if(end-start+1>n1){
                arr[s2.charAt(start++)-'a']++;
            }
            boolean flag=true;
            for(int i:arr) if(i!=0) flag=false;
            if(flag) return flag;
        }
        return false;
    }
}
