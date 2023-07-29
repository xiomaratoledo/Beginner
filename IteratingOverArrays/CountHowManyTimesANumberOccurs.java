/** Count how many times a number occurs

Write a program that reads an array of ints and an integer number n.

The program must check how many times n occurs in the array.

Input data format
The first line contains the size of the input array.

The second line contains elements of the array separated by spaces.

The third line contains n.

Output data format

The result is only a single non-negative integer number.
* 
* Hint
* 
* use 2 seperate loops.
1) first loop for array.
2) second loop for checking the necessary condition. (if you wont do this, then your value of n wont be scanned properly & will definitely get an error.
3) int count = 0;
        int n = scan.nextInt();  //declare them before the 2nd loop.
            
:)
*  Sample Input 1:

6
1 2 3 4 2 1
2

Sample Output 1:

2

Sample Input 2:

9
1 2 3 4 5 4 3 2 1
7

Sample Output 2:

0
*/
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] myArray = new int[length];
        int count = 0;
        for (int i = 0; i < length; i++) {
            myArray[i] = scanner.nextInt();
        }
        int contains = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            if (myArray[i] == contains) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
