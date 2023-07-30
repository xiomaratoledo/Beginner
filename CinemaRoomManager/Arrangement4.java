package Cinema;

import java.util.Scanner;

public class Cinema {
    Scanner scanner = new Scanner(System.in);
    int rows;
    int seats;
    char[][] room;
    int totalSeats = 0;
    int userRow = 0;
    int userSeat = 0;
    int ticketPrice = 0;
    int totalIncome = 0;
    int frontrows = 0;
    int backrows = 0;
    int userItem;
    
    public static void main(String[]args) {
        Cinema cinema = new Cinema();
        cinema.setRoomSize();
        cinema.createRoom();
        cinema.showMenu();
    }
    
    public void setRoomSize() {
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seats = scanner.nextInt();
        setStats();
    }
    
    public void buyTicket() {
        System.out.println("Enter a row number:");
        userRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        userSeat = scanner.nextInt();
        room[userRow - 1][userSeat - 1] = 'B';
    }

    public void setStats() {
        totalSeats = rows * seats;
        if (totalSeats <= 60) {
            totalIncome = totalSeats * 10;
        } else if (totalSeats > 60) {
            frontrows = rows / 2;
            backrows = rows / 2 + rows % 2;
            totalIncome = frontrows * seats * 10 + backrows * seats * 8;
        }
    }
    
    public void setTicketPrice() {
        if (totalSeats <= 60) {
            ticketPrice = 10;
        } else if (totalSeats > 60) {
            if (userRow <= frontrows){
                ticketPrice = 10;
            } else if (userRow > frontrows) {
                ticketPrice = 8;
            }
        }
        
    }
    
    public void printTicketPrice() {
        System.out.println("Ticket price: $" + ticketPrice);
    }
    
    public void getTotalIncome() {
        System.out.println("Total income:");
        System.out.println("$" + totalIncome);
    }
    public void createRoom() {
        room = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                room[i][j] = 'S';
            }
        }
    }
    
    public void printRoom() {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= seats; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 1; i <= rows; i++) {
            System.out.print(i);
            for (int j = 0; j < seats; j++) {
                System.out.print(" " + room[i - 1][j]);
            }
            System.out.println();
        }
    }
    
    public void showMenu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.print("0. Exit");
        userItem = scanner.nextInt();
        while (userItem != 0) {
            if (userItem == 1) {
                printRoom();
                showMenu();
            } else if (userItem == 2) {
                buyTicket();
                setTicketPrice();
                printTicketPrice();
                showMenu();
            }
        }
    }
}
