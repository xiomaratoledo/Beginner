import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input == 1) {
                larger++;
            } else if (input == -1) {
                smaller++;
            } else if (input == 0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}
