class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0,end=0,max=0;
        while(end<n){
            char ch=s.charAt(end);
            if(map.containsKey(ch)){
                max=end-start<max?max:end-start;
                start=map.get(ch)+1<start?start:map.get(ch)+1;
                map.put(ch,end);
                System.out.print(max+", ");
                System.out.println(start);
            }else{
                map.put(ch,end);
            }
            end++;
        }
        return end-start<max?max:end-start;
    }
}
