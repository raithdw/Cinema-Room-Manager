package cinema;

import java.util.Scanner;


public class Cinema {
    static Scanner sc = new Scanner(System.in);
    static int costFrontHalf = 10;
    static int costBackHalf = 8;
    static int purchasedTickets = 0;
    static float percentage = 0F;
    static int income = 0;
    static int totalIncome = 0;

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();
        String[][] cinema = new String[rows + 1][seats + 1];
        initialFill(rows, seats, cinema);

        while (true) {
            int menuChoice = printMenu();
            if (menuChoice == 0) {
                break;
            } else if (menuChoice == 1) {
                printCinemaScheme(rows, seats, cinema);
            } else if (menuChoice == 2) {
                buyTicket(rows, seats, cinema);
            } else if (menuChoice == 3) {
                showStatistics(rows, seats);
            } else {
                System.out.println("Please, enter a valid action");
            }
        }
    }

    static void initialFill(int rows, int seats, String[][] cinema) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
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

    static int printMenu() {
        System.out.println("\n1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        return sc.nextInt();
    }

    static void printCinemaScheme(int rows, int seats, String[][] cinema) {
        System.out.println("\nCinema:");
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void buyTicket(int rows, int seats, String[][] cinema) {
        if (purchasedTickets == rows * seats) {
            System.out.println("Sorry, all tickets are sold out!");
        } else {
            while (true) {
                System.out.println("\nEnter a row number:");
                int rowNum = sc.nextInt();
                System.out.println("Enter a seat number in that row:");
                int seatNum = sc.nextInt();
                if (rowNum > 0 && rowNum <= rows && seatNum > 0 && seatNum <= seats) {
                    if ("S".equals(cinema[rowNum][seatNum])) {
                        cinema[rowNum][seatNum] = "B";
                        if (rows * seats <= 60 || rowNum <= rows / 2) {
                            income += costFrontHalf;
                            System.out.println("\nTicket price: $" + costFrontHalf);
                        } else {
                            income += costBackHalf;
                            System.out.println("\nTicket price: $" + costBackHalf);
                        }
                        purchasedTickets++;
                        break;
                    } else {
                        System.out.println("\nThat ticket has already been purchased!");
                    }
                } else {
                    System.out.println("\nWrong input!");
                }
            }
        }
    }

    static void showStatistics(int rows, int seats) {
        if (rows * seats <= 60) {
            totalIncome = rows * seats * costFrontHalf;
        } else {
            int totalCostFrontHalf = rows / 2 * seats * costFrontHalf;
            int totalCostBackHalf = (rows - rows / 2) * seats * costBackHalf;
            totalIncome = totalCostFrontHalf + totalCostBackHalf;
        }
        percentage = (float)purchasedTickets * 100/ (rows * seats);
        System.out.printf("%nNumber of purchased tickets: %d%nPercentage: %.2f%%%nCurrent income: $%d%nTotal income: $%d%n",
                purchasedTickets, percentage, income, totalIncome);
    }
}