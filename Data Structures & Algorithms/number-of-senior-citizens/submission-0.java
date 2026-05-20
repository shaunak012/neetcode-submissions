class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;
        for(int i=0;i<n;i++){
            count+=isOld(details[i]);
        }
        return count;
    }
    public int isOld(String str){
        int pno=10;
        int gen=1;
        int age=(str.charAt(pno+gen)-'0')*10+(str.charAt(pno+gen+1)-'0');
        return age>60?1:0;
    }
}