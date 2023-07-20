import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int largest = 0;
        while (n != 0) {
            if (largest < n) {
                largest = n;
            }
            n = scanner.nextInt();
        }
        System.out.println(largest);
    }
}
