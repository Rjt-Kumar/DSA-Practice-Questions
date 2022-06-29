package Bactracking;

public class Nqueens {

    public static void main(String[] args) {
         boolean[][] board = new boolean[4][4];
         queens(board,0);

    }
    public static void queens(boolean[][] board,int row){

        if( row == board.length ){
            display(board);
            System.out.println();
            return;
        }

        for( int col = 0; col <= board.length - 1;col++){

            if( isSafe(board,row,col) ){
                board[row][col] = true;
                queens(board,row+1);
                board[row][col] = false;
            }

        }

    }

    public static boolean isSafe(boolean[][] board,int row,int col){
        // up
        for(int i = 1; i <= row; i++){
            if( board[row-i][col]){
                return false;
            }
        }

        // diagonal right

        for( int n = 1 ; n <= Math.min(row, board.length-col-1);n++ ){
            if(board[row-n][col+n]){
                return false;
            }
        }


        // diagonal left
        for(int m = 1; m <= Math.min(row,col);m++ ){
            if(board[row-m][col-m]){
                return false;
            }
        }

        return true;

    }

    public static  void display(boolean[][] board){
        for(boolean[] arr: board){
            for(boolean elm : arr){
                if( elm ){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
