/*
 * @lc app=leetcode id=1275 lang=java
 *
 * [1275] Find Winner on a Tic Tac Toe Game
 */

// @lc code=start
class Solution {
    public String tictactoe(int[][] moves) {
        int m = moves.length;
        char[][] board = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                board[i][j] = 'X';
            }
        }
        for(int i=0; i<m; i++){
            if(i%2==0){
                board[moves[i][0]][moves[i][1]] = 'A';
            }
            else{
                board[moves[i][0]][moves[i][1]] = 'B';
            }
        }
        for(int i=0; i<3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][1]!='X'){
                return ""+board[i][1];
            }
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[1][i] != 'X'){
                return ""+board[1][i];
            }
        }
        if(board[0][0] == board[1][1] && board[1][1]==board[2][2] && board[1][1]!='X') return ""+board[1][1];
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[1][1] != 'X') return ""+board[1][1];

        if(moves.length == 9) return "Draw";
        return "Pending";
    }
}
// @lc code=end

