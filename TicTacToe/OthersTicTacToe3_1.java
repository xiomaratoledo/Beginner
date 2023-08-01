package tictactoe;
import java.util.*;

public class OthersTicTacToe3_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int count = 0;
       char[][] arr = new char[3][3];
       int xs = 0;
       int os = 0;
       boolean xwin = false;
       boolean owin = false;

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = str.charAt(count++);
                if (arr[i][j] == 'X') {
                    xs++;
                } else if (arr[i][j] == 'O') {
                    os++;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("| ");
        }
        System.out.println("---------");

        for (int i = 0; i < 3; i++) {
            int row = 0;
            int col = 0;
            int diag = 0;
            int rdiag = 0;
            for (int j = 0; j < 3; j++) {
                row += arr[i][j];
                col += arr[j][i];
                diag += arr[j][j];
                rdiag += arr[j][2 - j];
            }
            xwin = xwin || row == 264 || col == 264 || diag == 264 || rdiag == 264;
            owin = owin || row == 237 || col == 237 || diag == 237 || rdiag == 237;
        }
        String result = Math.abs(xs - os) > 1 || xwin && owin ? "Impossible"
                        : xwin ? "X wins"
                        : owin ? "O wins"
                        : xs + os == 9 ? "Draw"
                        : "Game not finished";
        System.out.print(result);
    }
}
