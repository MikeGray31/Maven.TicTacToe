package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
        board = matrix;
    }

    public Boolean isInFavorOfX() {

        if(checkforWin('X')){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {

        if(checkforWin('O')){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if(!checkforWin('O') && !checkforWin('X')){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if(isInFavorOfO()){
            return "O";
        }
        else if(isInFavorOfX()){
            return "X";
        }
        return "";
    }

    public Boolean checkforWin(Character isXorO){
        for(int i = 0; i < 3 ; i++){
            if(board[i][0] == isXorO && board[i][1] == isXorO && board[i][2] == isXorO){
                return true;
            }
        }
        for(int i = 0; i < 3 ; i++){
            if(board[0][i] == isXorO && board[1][i] == isXorO && board[2][i] == isXorO) {
                return true;
            }
        }
        if(board[0][0] == isXorO && board[1][1] == isXorO && board[2][2] == isXorO) {
            return true;
        }
        if(board[2][0] == isXorO && board[1][1] == isXorO && board[0][2] == isXorO) {
            return true;
        }
        return false;
    }
}
