// John Backus

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        final int nextEven = ((number + 2) / 2) * 2;
        System.out.println(nextEven);
    }
}


// User 75300313
// you can use this n + 2 - n % 2 
