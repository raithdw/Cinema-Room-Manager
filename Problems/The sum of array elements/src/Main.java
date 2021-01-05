import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int elements = input.nextInt();
            arr[i] = elements;
            sum += arr[i];
        }

        System.out.println(sum);
    }
}