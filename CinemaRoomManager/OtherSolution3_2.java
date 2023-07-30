package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = scanner.nextInt();

        String[][] seatArrangement = new String[numberOfRows][numberOfSeats];

        // Initializing the seating arrangements
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfSeats; j++) {
                seatArrangement[i][j] = "S";
            }
        }

        // Visualizing the seating arrangements
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= numberOfSeats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < numberOfRows; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < numberOfSeats; j++) {
                System.out.print(seatArrangement[i][j] + " ");
            }
            System.out.println();
        }

        // Seat booking
        System.out.println("Enter a row number:");
        int rowNumber = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNumber = scanner.nextInt();
        seatArrangement[rowNumber - 1][seatNumber - 1] = "B";

        // Ticket price calculation
        int totalSeats = numberOfRows * numberOfSeats;
        int frontHalf = (numberOfRows / 2);
        int ticketPrice;

        if (totalSeats > 60) {
            if (rowNumber <= frontHalf) {
                ticketPrice = 10;
                System.out.println("Ticket price: $" + ticketPrice);
            } else {
                ticketPrice = 8;
                System.out.println("Ticket price: $" + ticketPrice);
            }
        } else {
            ticketPrice = 10;
            System.out.println("Ticket price: $" + ticketPrice);
        }

        // Visualizing the updated seating arrangements
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= numberOfSeats; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < numberOfRows; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < numberOfSeats; j++) {
                System.out.print(seatArrangement[i][j] + " ");
            }
            System.out.println();
        }
    }
}
