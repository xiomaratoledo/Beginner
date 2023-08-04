package tictactoe;
//_XXOO_OX_
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String userInput;
    char[][] grid = new char[3][3];
    int xCount = 0;
    int oCount = 0;
    int emptyCount = 0;
    int a;
    int b;
    boolean isInputNumbers = false;
    
    public static void main(String[] args) {
        Main newGame = new Main();
        newGame.getUserInput();
        newGame.createBoard();
        newGame.printBoard();
        newGame.getCoordinates('X');
        newGame.printBoard();
        //newGame.countPieces();
        //newGame.getGameStatus();
    }
    public void getUserInput() {
        userInput = scanner.next();
    }
    public void getCoordinates(char symbol) {
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            isInputNumbers = true;
        } else {
            System.out.println("You should enter numbers!");
            getCoordinates(symbol);
        }
        if (isInputNumbers) {
            if (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Coordinates should be from 1 to 3!");
                getCoordinates(symbol);
            } else if (grid[a - 1][b - 1] == 'X' || grid[a - 1][b - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                getCoordinates(symbol);
            } else if (grid[a - 1][b - 1] == ' ' || grid[a - 1][b - 1] == '_'){
                grid[a - 1][b - 1] = symbol;
            }
        }
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
    public void getGameStatus() {
        if (isImpossible() || isPieceWins('X') && isPieceWins('O')) {
            System.out.println("Impossible");
        } else if (isPieceWins('X') || isPieceWins('O')) {
            System.out.println(isPieceWins('X')? "X wins" : "O wins");
        } else if (isGameNotFinished()) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }
    public void countPieces() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 'X') {
                    ++xCount;
                } else if (grid[i][j] == 'O') {
                    ++oCount;
                } else if (grid[i][j] == ' ' || grid[i][j] == '_') {
                    ++emptyCount;
                }
            }
        }
    }
    public boolean isGameNotFinished() {
        return emptyCount >= 1;
    }
    public boolean isImpossible() {
        return xCount - oCount >= 2 || oCount - xCount >= 2;
    }
    public boolean isPieceWins(char symbol) {
        return grid[0][0] == symbol && grid[0][1] == symbol && grid[0][2] == symbol
                || grid[1][0] == symbol && grid[1][1] == symbol && grid[1][2] == symbol
                || grid[2][0] == symbol && grid[2][1] == symbol && grid[2][2] == symbol
                || grid[0][0] == symbol && grid[1][0] == symbol && grid[2][0] == symbol
                || grid[0][1] == symbol && grid[1][1] == symbol && grid[2][1] == symbol
                || grid[0][2] == symbol && grid[1][2] == symbol && grid[2][2] == symbol
                || grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol
                || grid[2][0] == symbol && grid[1][1] == symbol && grid[0][2] == symbol;
    }
    public boolean isDraw() {
        return emptyCount == 0;
    }
}
