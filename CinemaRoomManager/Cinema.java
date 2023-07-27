package Cinema;

import java.util.Scanner;

public class Cinema {
    Scanner scanner = new Scanner(System.in);
    int rowsNumber;
    int rowSeatsNumber;
    int totalSeats = 0;
    int totalIncome = 0;
    int frontrows = 0;
    int backrows = 0;
    
    public static void main(String[]args) {
        Cinema cinema = new Cinema();
        cinema.getUserInput();
        cinema.getTotalIncome();
        cinema.getStats();
        
        
    }
    
    public void getUserInput() {
        System.out.println("Enter the number of rows:");
        rowsNumber = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        rowSeatsNumber = scanner.nextInt();
        totalSeats = rowsNumber * rowSeatsNumber;
        if (totalSeats <= 60) {
            totalIncome = totalSeats * 10;
        } else if (totalSeats > 60) {
            frontrows = rowsNumber / 2;
            backrows = rowsNumber / 2 + rowsNumber % 2;
            totalIncome = frontrows * rowSeatsNumber * 10 + backrows * rowSeatsNumber * 8;
        }
    }
    
    public void getTotalIncome() {
        System.out.println("Total income:");
        System.out.println("$" + totalIncome);
    }
    
    public void getStats() {
        System.out.println("rowsNumber: " + rowsNumber);
        System.out.println("rowSeatsNumber: " + rowSeatsNumber);
        System.out.println("totalSeats: " + totalSeats);
        System.out.println("totalIncome: " + totalIncome);
        System.out.println("frontrows: " + frontrows);
        System.out.println("backrows: " + backrows);
        System.out.println(rowsNumber / 2);
        System.out.println(rowsNumber / 2 + rowsNumber % 2);
        System.out.println(frontrows * rowSeatsNumber * 10 + backrows *rowSeatsNumber * 8);
    }
}
