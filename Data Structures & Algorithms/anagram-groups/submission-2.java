class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        int[] arr=new int[n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<String> inner=new ArrayList<>();
            if(arr[i]==-1) continue;
            inner.add(strs[i]);
            arr[i]=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]==-1) continue;
                if(isAnnagram(strs[i],strs[j])){
                    inner.add(strs[j]);
                    arr[j]=-1;
                }
            }
            ans.add(inner);
        }
        return ans;
    }
    public boolean isAnnagram(String str1,String str2){
        int n1=str1.length();
        int n2=str2.length();
        if(n1!=n2) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<n1;i++){
            if(!map1.containsKey(str1.charAt(i))){
                map1.put(str1.charAt(i),0);
            }
            map1.put(str1.charAt(i),map1.get(str1.charAt(i))+1);
        }
        for(int i=0;i<n2;i++){
            if(!map2.containsKey(str2.charAt(i))){
                map2.put(str2.charAt(i),0);
            }
            map2.put(str2.charAt(i),map2.get(str2.charAt(i))+1);
        }
        return map1.equals(map2);
    }
}
