import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        if ((numb > -15 && numb <= 12) ||
                (numb > 14 && numb < 17) ||
                (numb >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}