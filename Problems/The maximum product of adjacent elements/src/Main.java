import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int max = arr[0] * arr[1];
        int product = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            product = arr[i] * arr[i + 1];
            if (product > max) {
                max = product;
            }
        }

        System.out.println(max);
    }
}