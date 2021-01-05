import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(validateArray(createArray(new Scanner(System.in))) ? "YES" : "NO");
    }

    private static int[][] createArray(Scanner scanner) {
        int bound = (int) Math.pow(scanner.nextInt(), 2);
        int[][] arr = new int[bound][bound];
        int row = 0;
        int column = 0;
        int totalCount = (int) Math.pow(bound, 2);
        for (int i = 0; i < totalCount; i++) {
            if (i != 0 && i % bound == 0) {
                row++;
                column = 0;
            }
            int num = scanner.nextInt();
            if (num < 1 || num > bound) {
                arr = null;
                break;
            }
            arr[row][column] = num;
            column++;
        }
        return arr;
    }

    private static boolean validateArray(int[][] arr) {
        boolean result = true;
        if (arr != null) {
            int length = arr.length;
            int square = (int) Math.sqrt(length);
            int[][] horizontalArr = new int[length][length];
            int[][] verticalArr = new int[length][length];
            int[][] smallSquare = new int[length][length];
            for (int i = 0; i < length && result; i++) {
                int n = i / square * (square - 1);
                for (int j = 0; j < arr[i].length; j++) {
                    int num = arr[i][j];
                    int position = num - 1;
                    int smallPosition = i / square + j / square + n;
                    if (num <= length && num > 0
                            && horizontalArr[i][position] == 0 && verticalArr[position][j] == 0
                            && smallSquare[smallPosition][position] == 0) {
                        horizontalArr[i][position] = num;
                        verticalArr[position][j] = num;
                        smallSquare[smallPosition][position] = num;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        } else {
            result = false;
        }

        return result;
    }
}