class Solution {
    public boolean isAnagram(String str1, String str2){
        int arr[] = new int[26];
        Arrays.fill(arr,0);
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            arr[ch-'a']=arr[ch-'a']+1;
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            arr[ch-'a']=arr[ch-'a']-1;
        }
        for(int i:arr){
            if(i!=0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==-1) continue;
            arr[i]=-1;
            List<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            for(int j=i+1;j<n;j++){
                if(isAnagram(strs[i],strs[j])){
                    temp.add(strs[j]);
                    arr[j]=-1;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
