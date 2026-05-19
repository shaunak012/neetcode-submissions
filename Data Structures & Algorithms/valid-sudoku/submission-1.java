class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] rows=new HashSet[n];
        HashSet<Character>[] cols=new HashSet[n];
        HashSet<Character>[] boxes=new HashSet[n];
        for(int i=0;i<n;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.') continue;
                if(rows[i].contains(board[i][j])) return false;
                if(cols[j].contains(board[i][j])) return false;
                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);
                int box=i/3*3+j/3;
                if(boxes[box].contains(board[i][j])) return false;
                boxes[box].add(board[i][j]);
            }
        }
        return true;
    }
}
