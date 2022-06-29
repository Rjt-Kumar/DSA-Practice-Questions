package Bactracking;

public class Sudoku {

    public static void main(String[] args) {

    }

    public void solver(char[][] board,int row , int col){

        if( row == board.length - 1 && col == board.length){

            return;
        }
        if( row == board.length ){
            return;
        }

        if( col == board.length ){
            solver(board,row+1,0);
            return;
        }

        if( board[row][col] == '.' ){

            for( int i = 1; i < 10; i++){

                char ch = (char)(i+'0');
                if(isSafe(board,row,col,ch)){
                    board[row][col] = ch;
                    solver(board,row,col+1);
                    board[row][col] = '.';
                }
            }// for loop over
        }else{
            solver(board,row,col+1);
        }
    }

    public boolean isSafe(char[][] board,int row,int col,char target){



        for(int i = 0; i < board.length ; i++){

            if(board[i][col] == target){
                return false;
            }
            if(board[row][col] == target){
                return false;
            }

        }


        // cube

        int Rstart = row - (row%3);
        int Cstart = col - (col%3);

        for( int a = Rstart ; a < (Rstart + 3); a++){

            for(int b = Cstart; b < (Cstart + 3); b++){

                if( board[a][b] == target){
                    return false;
                }
            }
        }

        return true;
    }

}
