package com.company;

/**
 * Tic Tac Toe Game designed: Board made using char array
 */
public class TicTacToeGame {
    //variables
    static char[] board=new char[10];
    // method to assign empty spaces to board
    static void boardTicTacToe(){
        for(int i=1;i<board.length;i++) {
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        // game board defined
        boardTicTacToe();
    }
}
