import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCompany = input.nextInt();
        double[] arrIncome = new double[numCompany];
        double[] arrTax = new double[numCompany];
        double[] taxes = new double[numCompany];
        int count = 0;
        double maxTax = 0;

        for (int i = 0; i < arrIncome.length; i++) {
            arrIncome[i] = input.nextInt();
        }

        for (int i = 0; i < arrTax.length; i++) {
            arrTax[i] = input.nextInt();
        }

        for (int i = 0; i < arrIncome.length; i++) {
            taxes[i] = arrIncome[i] * (arrTax[i] / 100.0);
            if (taxes[i] > maxTax) {
                maxTax = taxes[i];
                count = i + 1;
            }

        }
        System.out.println(count);
    }
}
