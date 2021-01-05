import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] matrix = new int[a][b];

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[0].length; y++) {
                matrix[x][y] = scanner.nextInt();
            }
        }

        for (int y = 0; y < matrix[0].length; y++) {
            System.out.print("\n");
            for (int x = matrix.length - 1; x >= 0; x--) {
                System.out.print(matrix[x][y] + " ");
            }
        }
    }
}