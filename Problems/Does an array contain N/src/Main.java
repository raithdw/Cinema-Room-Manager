import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        boolean checkNumb = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int userNumb = input.nextInt();

        for (int j : arr) {
            if (j == userNumb) {
                checkNumb = true;
                break;
            }
        }

        System.out.println(checkNumb);
    }
}