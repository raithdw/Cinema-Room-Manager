import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int counter = 1;

        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }
        int maxValue = numbers[0];


        for (int number : numbers) {
            if (number > maxValue) {
                counter++;
                maxValue = number;
            }
        }


        System.out.println(counter);
    }
}