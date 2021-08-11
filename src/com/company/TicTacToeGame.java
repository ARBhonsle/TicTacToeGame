package com.company;

import java.util.Scanner;

/**
 * Tic Tac Toe Game designed: Board made using char array, player chooses letter(O or X) to start game
 * Added: Game Board Displayed
 *      ++ User can make a move
 *      ++Computer moves
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
    // displays game board
    static void displayBoard(){
        // 0th index ignored
        System.out.println("Tic Tac Toe Game Board");
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
        System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
    }
    // method makes move to location/index given by Player(user)
    static void userPlay(){
        boolean played = false;
        while(!played) {
            System.out.println("Give board index(1-9) to set your game move ");
            Scanner sc =new Scanner(System.in);
            int playMove=sc.nextInt();
            if (playMove>0 && playMove<10){
                if (board[playMove] == ' ') {
                    board[playMove] = playerLetter;
                    played = true;
                }
            }
            else {
                System.out.println("Select another index");
            }
        }
        displayBoard();
    }

    //check for free space before making move for computer
    static void computerPlay() {
        // generates move for computer using random function
        // while loop runs until flag true, flag becomes false on making a move
        boolean played = false;
        while(!played) {
            int playMove = (int) (Math.random() * 10) % 9 + 1;
            if (playMove>0 && playMove<10){
                if (board[playMove] == ' ') {
                    board[playMove] = computerLetter;
                    played = true;
                }
            }
        }
        displayBoard();
    }

    public static void main(String[] args) {
        // displaying welcome message
        System.out.println("Welcome to Tic Tac Toe Game");
        // game board created
        boardCreate();
        playerChoice();
        displayBoard();
        userPlay();
        computerPlay();
    }
}
