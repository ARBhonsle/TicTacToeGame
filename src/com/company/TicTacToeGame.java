package com.company;

import java.util.Scanner;

/**
 * Tic Tac Toe Game designed: Board made using char array, player chooses letter(O or X) to start game
 */
public class TicTacToeGame {
    //variables
    static char[] board=new char[10];
    static char playerLetter,computerLetter;
    // method to assign empty spaces to board
    static void boardCreate(){
        // 0th index ignored
        for(int i=1;i<board.length;i++) {
            board[i] = ' ';
        }
    }
    // method to let player choose letter(O or X) and sets it for playing game
    static void playerChoice(){
        System.out.println("Choose letter X or O to play game");
        Scanner sc=new Scanner(System.in);
        playerLetter=sc.next().toUpperCase().charAt(0);
        switch(playerLetter){
            case 'X':
                System.out.println("Player Plays with : X letter");
                System.out.println("Computer Plays with : O letter");
                computerLetter='O';
                break;
            case 'O':
                System.out.println("Player Plays with : O letter");
                System.out.println("Computer Plays with : X letter");
                computerLetter='X';
                break;
            default:
                System.out.println("Incorrect Input");
                break;
        }
    }

    public static void main(String[] args) {
        // displaying welcome message
        System.out.println("Welcome to Tic Tac Toe Game");
        // game board created
        boardCreate();
        playerChoice();
    }
}
