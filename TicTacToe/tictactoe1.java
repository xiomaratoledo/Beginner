package tictactoe;

import java.util.Scanner;

public class Main {
    
    char[][] grid = new char[3][3];
    
    public static void main(String[] args) {
        Main newGame = new Main();
        newGame.createBoard();
        newGame.grid[0][0] = 'X';
        newGame.grid[0][1] = 'O';
        newGame.printBoard();
    }
    public void createBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }
    public void printBoard() {
        System.out.println(grid[0][0] + " " + grid[0][1] + " " +grid[0][2]);
        System.out.println(grid[1][0] + " " + grid[1][1] + " " +grid[1][2]);
        System.out.println(grid[2][0] + " " + grid[2][1] + " " +grid[2][2]);
    }
}
