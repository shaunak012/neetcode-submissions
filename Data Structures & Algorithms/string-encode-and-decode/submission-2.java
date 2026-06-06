class Solution {

    public String encode(List<String> strs) {
        int n=strs.size();
        String str="";
        for(int i=0;i<n;i++){
            str=str+strs.get(i).length()+"#"+strs.get(i);
        }
        return str;
    }

    public List<String> decode(String str) {
        List<String> decoded=new ArrayList<>();
        int n=str.length();
        int size=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch-'0'<=9 && ch-'0'>=0){
                size=size*10+(ch-'0');
            }else if(ch=='#' ){
                decoded.add(str.substring(i+1,i+size+1));
                i=i+size;
                size=0;
            }
        }
        return decoded;
    }
}
