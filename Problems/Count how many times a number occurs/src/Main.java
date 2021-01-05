import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int count = 0;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int n = input.nextInt();

        for (int num: arr) {
            if (num == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}