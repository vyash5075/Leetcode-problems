class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                   
                    boolean ans=check(board,i,j,board[i][j]);
                    
                    if(ans==false){
                        return false;
                    }
                }
            }
        }
        return true;
    }
        
        
        public static boolean check(char board[][],int x,int y,char item){
            int count=0;
            for(int j=0;j<9;j++){
                if(board[x][j]==item){
                    count++;
                 
                }
                    
                } 
            for(int i=0;i<9;i++){
                if(board[i][y]==item){
                   count++;
                 
                }
                    
                }
            
            int smi=3*(x/3);
            int smj=3*(y/3);
            System.out.println(smi+" "+smj);
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(board[i+smi][j+smj]==item){
                       count++;
                    }
                }
            }
            if(count==3){
                return true;
            }
            return false;  
        }
        
    
}
