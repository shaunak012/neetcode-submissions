class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            if(map2.containsKey(t.charAt(i)) && map2.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
                map2.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}