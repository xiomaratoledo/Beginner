//Sue
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        // Using counter/loop option
//        int counter = 0;
//
//        for (int i = a; i <= b; i++) {
//
//            if (i % n == 0) {
//                counter++;
//            }
//        }
//
        //Using math shortcut
        System.out.println((b - a) / n + 1);

    }
}
