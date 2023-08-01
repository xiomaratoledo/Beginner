

import java.util.Scanner;

public class TicTacToe3 {
    
    Scanner scanner = new Scanner(System.in);
    String userInput;
    int empty = 0;
    int xCount = 0;
    int oCount = 0;
    
    public static void main(String[] args) {
        Main newGame = new Main();
        newGame.getUserInput();
        newGame.countPieces();
        newGame.printBoard();
        newGame.getGameStatus();
    }
    public void getUserInput() {
        userInput = scanner.next();
    }
    public void printBoard() {
        System.out.println("---------");
        System.out.println("| " + userInput.charAt(0) + " " + userInput.charAt(1) + " " + userInput.charAt(2) + " |");
        System.out.println("| " + userInput.charAt(3) + " " + userInput.charAt(4) + " " + userInput.charAt(5) + " |");
        System.out.println("| " + userInput.charAt(6) + " " + userInput.charAt(7) + " " + userInput.charAt(8) + " |");
        System.out.println("---------");
    }
    public boolean gameNotFinished() {
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '_' || userInput.charAt(i) == ' ') {
                ++empty;
            }
        }
        return empty > 0;
    }
    public boolean gameImpossible() {
        return xCount - oCount >= 2 || oCount - xCount >= 2;
    }
    public boolean isWin(char a) {
        if (userInput.charAt(0) == a && userInput.charAt(1) == a && userInput.charAt(2) == a
                || userInput.charAt(3) == a && userInput.charAt(4) == a && userInput.charAt(5) == a
                || userInput.charAt(6) == a && userInput.charAt(7) == a && userInput.charAt(8) == a
                || userInput.charAt(0) == a && userInput.charAt(3) == a && userInput.charAt(6) == a
                || userInput.charAt(1) == a && userInput.charAt(4) == a && userInput.charAt(7) == a
                || userInput.charAt(2) == a && userInput.charAt(5) == a && userInput.charAt(8) == a
                || userInput.charAt(0) == a && userInput.charAt(4) == a && userInput.charAt(8) == a
                || userInput.charAt(6) == a && userInput.charAt(4) == a && userInput.charAt(2) == a
                ) {
            return true;
        }
        return false;
    }
    public void countPieces() {
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '_' || userInput.charAt(i) == ' ') {
                ++empty;
            } else if (userInput.charAt(i) == 'X') {
                ++xCount;
            } else if (userInput.charAt(i) == 'O') {
                ++oCount;
            }
        }
    }
    
    public void getGameStatus() {
        if (gameImpossible() || isWin('X') && isWin('O')) {
            System.out.println("Impossible");
        } else if (isWin('X') || isWin('O')) {
            System.out.println(isWin('X') ? "X wins" : "O wins");
        } else if (gameNotFinished()) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }
}
