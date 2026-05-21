class Solution {
    public int numUniqueEmails(String[] emails) {
        int n=emails.length;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            String str=cleaned(emails[i]);
            if(!set.contains(str)) set.add(str);
        }
        return set.size();
    }
    public String cleaned(String str){
        StringBuilder sb = new StringBuilder();
        int n=str.length();
        int flag=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='@') {
                flag=1;
            }
            if(str.charAt(i)=='.' && flag==0 || flag==2){
                continue;
            }
            if(str.charAt(i)=='+' && flag==0){
                flag=2;
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}