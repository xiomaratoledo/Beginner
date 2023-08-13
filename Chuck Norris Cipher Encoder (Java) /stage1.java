package chucknorris;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string:");
        String userInput = scanner.nextLine();
        for (int i = 0; i < userInput.length(); i++) {
            System.out.print(userInput.charAt(i) + " ");
        }
    }
}
