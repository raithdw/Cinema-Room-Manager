import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[][] starFigure = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                starFigure[i][j] = ".";
                if (i == j) {
                    starFigure[i][j] = "*";
                }
                if (i + j == n - 1) {
                    starFigure[i][j] = "*";
                }
                if ((i == n / 2) || (j == n / 2)) {
                    starFigure[i][j] = "*";
                }

                System.out.print(starFigure[i][j] + " ");
            }

            System.out.println();
        }
    }
}