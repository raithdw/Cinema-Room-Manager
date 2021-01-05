import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSize = input.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int n = input.nextInt();
        int m = input.nextInt();
        int countN = 0;
        int countM = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == n) {
                countN = j;
            }
            if (arr[j] == m) {
                countM = j;
            }
        }
        System.out.println(countN - countM == 1 ||
                           countN - countM == -1);
    }
}