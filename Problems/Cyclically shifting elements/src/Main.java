import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int temp = arr[arr.length - 1];

        System.arraycopy(arr, 0, arr, 1, arr.length - 1);

        arr[0] = temp;
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }
}