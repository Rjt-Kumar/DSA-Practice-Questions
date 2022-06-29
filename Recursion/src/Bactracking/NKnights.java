package Bactracking;

import static Bactracking.Nqueens.display;

public class NKnights {

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        knights(board,0,0,4);
    }

    public static void knights(boolean[][] board,int row,int col,int target){

        if( target == 0){
            display(board);
            System.out.println();
            return;
        }

        if( row == board.length ){
            return;
        }

        if( col == board.length ){
            knights(board,row+1,0,target);
            return;
        }

        if( col < board.length ){
            if( isSafe(board,row,col)){
                board[row][col] = true;
                knights(board,row,col+1,target-1);
                board[row][col] = false;
            }

            }

        knights(board,row,col+1,target);


    }

    public static boolean isSafe(boolean[][] board,int row,int col){
        // Up Right
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        // Up Left

        if( isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        // Right

        if( isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        // Left

        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(boolean[][] board,int row,int col){

        if( row >= 0 && row < board.length && col >= 0 && col < board.length ){
            return true;
        }else{
            return false;
        }
    }
}
