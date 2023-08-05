/** Write a program that reads a string and outputs "true" only when the letters of this string form a substring of the
* ordered English alphabet, for
* example, "abc", "xy", "pqrst".
*
* Otherwise, it should print out "false".
*
* Note: string can consist of a single character. Assume an empty string as an alphabet substring.
*
* Sample Input 1:
*
* abc
*
* Sample Output 1:
* 
* true
*
* Sample Input 2:
*
* bce
*
* Sample Output 2:
*
* false
*/


import java.util.Scanner;

public class PieceOfAlphabet {
    Scanner scanner;
    String userInput;
    boolean isOrdered = false;
    public static void main(String[] args) {
        PieceOfAlphabet main = new PieceOfAlphabet();
        main.getUserInput();
        main.processUserInput();
    }
    
    public void getUserInput() {
        scanner = new Scanner(System.in);
        userInput = scanner.next();
    }
    
    public void processUserInput() {
        if (userInput.length() != 1) {
            for (int i = 1; i < userInput.length(); i++) {
                if (userInput.charAt(i) - userInput.charAt(i - 1) == 1) {
                    isOrdered = true;
                } else {
                    isOrdered = false;
                    break;
                }
            }
        } else {
            isOrdered = true;
        }
        System.out.println(isOrdered);
    }
}
