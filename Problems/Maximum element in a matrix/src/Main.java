import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int maxValue = 0;
        int maxValueIndex = 0;
        int maxArrIndex = 0;


        for (int[] subArr : matrix) {
            for (int i = 0; i < subArr.length; i++) {
                subArr[i] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {

            if (matrix[i].length == 1) {
                if (matrix[i][0] > maxValue) {
                    maxArrIndex = i;
                    maxValueIndex = 0;
                    maxValue = matrix[i][0];
                }
            } else {
                maxValue = matrix[i][0];

                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > maxValue) {
                        maxValue = matrix[i][j];
                        maxValueIndex = j;
                        maxArrIndex = i;
                    }
                }
            }
        }

        System.out.println(maxArrIndex + " " + maxValueIndex);
    }
}