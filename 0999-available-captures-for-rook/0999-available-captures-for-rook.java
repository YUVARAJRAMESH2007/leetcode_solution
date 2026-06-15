class Solution {
    public int numRookCaptures(char[][] board) {
        int rx=0;
        int ry=0;
        int captures=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    rx=i;
                    ry=j;
                }
            }
        }
        for(int i=rx-1;i>=0;i--){
            if(board[i][ry]=='B'){
                break;
            }
            if(board[i][ry]=='p'){
                captures++;
                break;

            }
        }
        for(int i=rx+1;i<8;i++){
            if(board[i][ry]=='B'){
                break;
            }
            if(board[i][ry]=='p'){
                captures++;
                break;
            }
        }
        for(int j=ry-1;j>=0;j--){
            if(board[rx][j]=='B'){
                break;
            }
            if(board[rx][j]=='p'){
                captures++;
                break;
            }
        }
        for(int j=ry+1;j<8;j++){
            if(board[rx][j]=='B'){
                break;
            }
            if(board[rx][j]=='p'){
                captures++;
                break;
            }
        }
        return captures;
        
    }
}