import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rows = new String[0];
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            if ("end".equals(row)) {
                break;
            }
            String[] temp = new String[rows.length + 1];
            System.arraycopy(rows, 0, temp, 0, rows.length);
            temp[rows.length] = row;
            rows = temp;
        }
        String[] splitRow = rows[0].split("\\s+");
        int[][] matrix = new int[rows.length][splitRow.length];
        for (int i = 0; i < rows.length; i++) {
            String[] elements = rows[i].split("\\s+");
            for (int j = 0; j < elements.length; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int left = (i - 1 + matrix.length) % matrix.length;
                int right = (i + 1 + matrix.length) % matrix.length;
                int up = (j - 1 + matrix[i].length) % matrix[i].length;
                int down = (j + 1 + matrix[i].length) % matrix[i].length;
                int sum = matrix[left][j] + matrix[right][j] + matrix[i][up] + matrix[i][down];
                result[i][j] = sum;
            }
        }


        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}