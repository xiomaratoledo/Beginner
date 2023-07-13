import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int i = 1;
        do {
            System.out.println(i * i);
            i++;
        } while (i * i <= num);
    }
}
