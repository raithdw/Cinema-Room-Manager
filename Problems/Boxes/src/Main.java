import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int[] arrNumb1 = new int[3];
        int[] arrNumb2 = new int[3];
        for (int i = 0; i < arrNumb1.length; i++) {
            arrNumb1[i] = input.nextInt();
        }
        for (int i = 0; i < arrNumb2.length; i++) {
            arrNumb2[i] = input.nextInt();
        }
        Arrays.sort(arrNumb1);
        Arrays.sort(arrNumb2);
        if (arrNumb1[0] < arrNumb2[0] && arrNumb1[1] <
            arrNumb2[1] && arrNumb1[2] < arrNumb2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (arrNumb1[0] > arrNumb2[0] && arrNumb1[1] >
                arrNumb2[1] && arrNumb1[2] > arrNumb2[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }

    }
}