import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];

        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }
}