class Solution {
    List<String> ans;
    String[] chars={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void letterCombinationsHelper(String digits,int i,String str) {
        if(digits.length()==0) return;
        if(i==digits.length()) {
            ans.add(str);
            return;
        }
        for(int j=0;j<chars[digits.charAt(i)-'2'].length();j++){
            letterCombinationsHelper(digits,i+1,str+chars[digits.charAt(i)-'2'].charAt(j));
        }
    }
    public List<String> letterCombinations(String digits) {
        ans=new ArrayList<>();
        letterCombinationsHelper(digits,0,"");
        return ans;
    }
}
