import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = input.nextLine().split(" ");
        int checkStrings;
        boolean order = true;

        for (int i = 0; i < arr.length - 1; i++) {
            checkStrings = arr[i].compareTo(arr[i + 1]);
            if (checkStrings > 0) {
                order = false;
                break;
            }
        }
        System.out.println(order);
    }
}