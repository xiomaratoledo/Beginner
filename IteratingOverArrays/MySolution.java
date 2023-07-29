//TheIndexOfTheFirstMaxInAnArray
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] myArray = new int[length]; 
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < length; i++) {
            myArray[i] = scanner.nextInt();
            if (myArray[i] > max) {
                max = myArray[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}
