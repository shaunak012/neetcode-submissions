class Solution {
    List<Integer> list;
    boolean ans;
    public boolean inList(int x) {
        for(int i=0;i<list.size();i++){
            if(list.get(i)==x) return true;
        }
        return false;
    }
    public void existHelper(int i,int j,char[][] board, String word,int index) {
        System.out.println(i+","+j);
        if(index==word.length()) {
            ans=true;
            return;
        }
        char ch=word.charAt(index);
        if(i-1>=0 && board[i-1][j]==ch && !inList((i-1)*board[0].length+j)){
            list.add((i-1)*board[0].length+j);
            existHelper(i-1,j,board,word,index+1);
            list.remove(list.size()-1);
        }
        if(j+1<board[0].length && board[i][j+1]==ch && !inList(i*board[0].length+j+1)){
            list.add(i*board[0].length+j+1);
            existHelper(i,j+1,board,word,index+1);
            list.remove(list.size()-1);
        }
        if(i+1<board.length && board[i+1][j]==ch && !inList((i+1)*board[0].length+j)){
            list.add((i+1)*board[0].length+j);
            existHelper(i+1,j,board,word,index+1);
            list.remove(list.size()-1);
        }
        if(j-1>=0 && board[i][j-1]==ch && !inList(i*board[0].length+j-1)){
            list.add(i*board[0].length+j-1);
            existHelper(i,j-1,board,word,index+1);
            list.remove(list.size()-1);
        }
        System.out.println();
    }
    public boolean exist(char[][] board, String word) {
        list=new ArrayList<>();
        ans=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    list.add(i*board[0].length+j);
                    existHelper(i,j,board,word,1);
                    list.remove(list.size()-1);
                }
            }
        }
        return ans;
    }
}
