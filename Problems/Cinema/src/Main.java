import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int seats = sc.nextInt();
        int[][] audience = new int[rows][seats];
        int counter;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                audience[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            counter = 0;

            for (int j = 0; j < seats; j++) {

                if (counter == k) {
                    System.out.println(i + 1);
                    return;
                }

                if (audience[i][j] == 0) {
                    counter++;
                    if (counter == k) {
                        System.out.println(i + 1);
                        return;
                    }
                } else {
                    counter = 0;
                }


            }

        }

        System.out.println(0);
    }
}