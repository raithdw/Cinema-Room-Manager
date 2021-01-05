import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inArray = scanner.nextLine().split(" ");
        int[] outArray = new int[inArray.length];

        //        System.out.println(Arrays.toString(array));
        int rShift = scanner.nextInt();
        int firstIndex = rShift % inArray.length;

        for (int i = 0; i < inArray.length; i++) {
            outArray[(i + firstIndex) % inArray.length] = Integer.parseInt(inArray[i]);

        }
        for (int i : outArray) {
            System.out.print(i + " ");
        }

    }
}