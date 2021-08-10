package com.company;

/**
 * Tic Tac Toe Game designed: Board made using char array
 */
public class TicTacToeGame {
    //variables
    static char[] board=new char[10];

    // method to assign empty spaces to board
    static void boardCreate(){
        // 0th index ignored
        for(int i=1;i<board.length;i++) {
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {
        // displaying welcome message
        System.out.println("Welcome to Tic Tac Toe Game");
        // game board created
        boardCreate();
    }
}
