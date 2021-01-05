import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] sides = new double[3];
        String object = input.next();
        double area = 0;
        if ("triangle".equalsIgnoreCase(object)) {
            for (int i = 0; i < 3; i++) {
                sides[i] = input.nextDouble();
                double s = (sides[0] + sides[1] + sides[2]) / 2;
                area = Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
            }
        } else if ("circle".equalsIgnoreCase(object)) {
            double r = input.nextDouble();
            area = 3.14 * Math.pow(r, 2);
        } else if ("rectangle".equalsIgnoreCase(object)) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            area = a * b;
        }

        System.out.println(area);
    }
}