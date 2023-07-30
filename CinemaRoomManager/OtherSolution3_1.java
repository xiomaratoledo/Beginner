package cinema;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cinema {

    /**
     * Limit seats for ticket $10.
     */
    static final int MAX_SEATS = 60;
    /**
     * Normal price ticket for the front half.
     */
    static final int TICKET_NORMAL_PRICE = 10;
    /**
     * Low price ticket for the back half.
     */
    static final int TICKET_LOW_PRICE = 8;

    public static void main(final String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("Enter the number of rows:");
        int rows = in.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = in.nextInt();
        String[][] cinema = new String[rows + 1][seats + 1];

        loadCinema(cinema);
        printCinema(cinema);
        System.out.println("\nEnter a row number:");
        int rNum = in.nextInt();
        System.out.println("Enter a seat number in that row:");
        int sNum = in.nextInt();
        ticketPrice(cinema, rows, seats, rNum, sNum);
        printCinema(cinema);
        totalIncome(rows, seats);

    }

    /**
     * Load initial status of cinema.
     *
     * @param cinema 2D Multi-dimensional array that represent a cinema.
     */
    public static void loadCinema(final String[][] cinema) {
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (i == 0 && j == 0) {
                    cinema[i][j] = " ";
                } else if (i == 0) {
                    cinema[i][j] = String.valueOf(j);
                } else if (j == 0) {
                    cinema[i][j] = String.valueOf(i);
                } else {
                    cinema[i][j] = "S";
                }
            }
        }
    }

    /**
     * Print status of cinema.
     *
     * @param cinema 2D Multi-dimensional array that represent a cinema.
     */
    public static void printCinema(final String[][] cinema) {
        System.out.println();
        System.out.println("Cinema:");
        for (String[] row : cinema) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /**
     * Calculate ticket price for seat choose.
     *
     * @param cinema 2D Multi-dimensional array that represent a cinema.
     * @param rows   Number of rows in the cinema.
     * @param seats  Number of seats in each row in the cinema.
     * @param rNum   Number of row choose.
     * @param sNum   Number of seat choose in the row.
     */
    public static void ticketPrice(final String[][] cinema, final int rows, final int seats,
            final int rNum, final int sNum) {
        System.out.println();
        int totalSet = rows * seats;
        if (totalSet <= MAX_SEATS) {
            System.out.println("Ticket price: $" + TICKET_NORMAL_PRICE);
            cinema[rNum][sNum] = "B";
        } else if (rNum <= rows / 2) {
            System.out.println("Ticket price: $" + TICKET_NORMAL_PRICE);
            cinema[rNum][sNum] = "B";
        } else {
            System.out.println("Ticket price: $" + TICKET_LOW_PRICE);
            cinema[rNum][sNum] = "B";
        }
    }

    /**
     * Calculate total income to cinema.
     *
     * @param rows  Rows in the cinema.
     * @param seats Seats in each row in the cinema.
     */
    public static void totalIncome(final int rows, final int seats) {
        int totalSet = rows * seats;
        if (totalSet <= MAX_SEATS) {
            System.out.println("Total income:\n$" + totalSet * TICKET_NORMAL_PRICE);
        } else {
            int frontHalf = ((rows / 2) * seats) * TICKET_NORMAL_PRICE;
            int backHalf = ((rows - rows / 2) * seats) * TICKET_LOW_PRICE;
            System.out.println("Total income:\n$" + (frontHalf + backHalf));
        }
    }
}
