//Tadas Gvazdaitis 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        
        System.out.println(b / n - (a - 1) / n);
        /*   if you find this simple expression confusing I tried my best to explain it below:
        B / N is the count of all numbers from 1 to B divisible by N. B included.
        A - 1 / n is the count of all numbers from 1 to A(exclusive) divisible by N. -1 appears because A is excluded.
        So the difference (B/N) - ((A-1)/N) is the count of numbers divisible by N in the range from A to B inclusively.
        cheers  */ 
    }
}
