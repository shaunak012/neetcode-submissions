class Solution {
    public String minWindow(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1==0||n2==0||n1<n2) return "";
        int[] ans={-1,0,0};
        int left=0;
        int right=0;
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<n2;i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(right<n1){
            char ch=s.charAt(right);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            if(map.containsKey(ch) && map2.get(ch)<=map.get(ch)){
                count++;
            }
            while(left<=right && count==n2){
                if(ans[0]==-1 || right-left+1<ans[0]){
                    ans[0]=right-left+1;
                    ans[1]=left;
                    ans[2]=right;
                }
                map2.put(s.charAt(left),map2.get(s.charAt(left))-1);
                if(map.containsKey(s.charAt(left)) && map2.get(s.charAt(left))<map.get(s.charAt(left))){
                    count--;
                }
                left++;
            }
            right++;
        }
        return ans[0]==-1?"":s.substring(ans[1],ans[2]+1);
    }
}
