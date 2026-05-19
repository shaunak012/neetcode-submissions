class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int[] arr =new int[26];
            Arrays.fill(arr,0);
            for(int j=0;j<strs[i].length();j++){
                char ch=strs[i].charAt(j);
                arr[ch-'a']++;
            }
            if(!map.containsKey(Arrays.toString(arr))){
                map.put(Arrays.toString(arr),new ArrayList<>());
            }
            map.get(Arrays.toString(arr)).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
}
