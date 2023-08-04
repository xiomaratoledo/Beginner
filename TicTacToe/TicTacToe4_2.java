import java.util.Scanner;

public class TicTacToe4 {
    
    Scanner scanner = new Scanner(System.in);
    String userInput;
    int empty = 0;
    int xCount = 0;
    int oCount = 0;
    char[][] grid = new char[3][3];
    public static void main(String[] args) {
        Main newGame = new Main();
        newGame.getUserInput();
        newGame.createGrid();
        newGame.countPieces();
        newGame.printBoard();
        newGame.askCoordinates();
    }
    public void getUserInput() {
        userInput = scanner.next();
    }
    public void createGrid() {
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = userInput.charAt(index);
                ++index;
            }
        }
    }
    public void askCoordinates() {
        String a = scanner.next();
        String b = scanner.next();
        // Converting String to Int
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        analyzeUserInput(c, d);
    }

    public void analyzeUserInput(int c, int d) {
        if (c > 3 || c < -1 || d > 3 || c < -1) {
            System.out.println("Coordinates should be from 1 to 3!");
            askCoordinates();
        } else if (grid[c - 1][d - 1] == 'X' || grid[c - 1][d - 1] == 'O') {
            System.out.println("This cell is occupied! Choose another one!");
            askCoordinates();
        } else if (grid[c - 1][d - 1] == ' ' || grid[c - 1][d - 1] == '_') {
            grid[c - 1][d - 1] = 'X';
            printBoard();
        } else {
            System.out.println("You should enter numbers!");
            askCoordinates();
        }
    }
    public void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.println("| " + grid[i][0] + " " + grid[i][1] + " " + grid[i][2] + " |");
        }
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
    public boolean isWin(char symbol) {
        if (userInput.charAt(0) == symbol && userInput.charAt(1) == symbol && userInput.charAt(2) == symbol
                || userInput.charAt(3) == symbol && userInput.charAt(4) == symbol && userInput.charAt(5) == symbol
                || userInput.charAt(6) == symbol && userInput.charAt(7) == symbol && userInput.charAt(8) == symbol
                || userInput.charAt(0) == symbol && userInput.charAt(3) == symbol && userInput.charAt(6) == symbol
                || userInput.charAt(1) == symbol && userInput.charAt(4) == symbol && userInput.charAt(7) == symbol
                || userInput.charAt(2) == symbol && userInput.charAt(5) == symbol && userInput.charAt(8) == symbol
                || userInput.charAt(0) == symbol && userInput.charAt(4) == symbol && userInput.charAt(8) == symbol
                || userInput.charAt(6) == symbol && userInput.charAt(4) == symbol && userInput.charAt(2) == symbol
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
