package tictactoe;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String userInput;
    char[][] grid = new char[3][3];
    
    public static void main(String[] args) {
        Main newGame = new Main();
        newGame.getUserInput();
        newGame.createBoard();
        newGame.printBoard();
    }
    public void getUserInput() {
        userInput = scanner.next();
    }
    public void createBoard() {
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = userInput.charAt(index);
                ++index;
            }
        }
    }
    public void printBoard() {
        System.out.println("---------");
        System.out.println("| " + grid[0][0] + " " + grid[0][1] + " " +grid[0][2] + " |");
        System.out.println("| " + grid[1][0] + " " + grid[1][1] + " " +grid[1][2] + " |");
        System.out.println("| " + grid[2][0] + " " + grid[2][1] + " " +grid[2][2] + " |");
        System.out.println("---------");
    }
}
