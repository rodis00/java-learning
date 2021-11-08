import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class zad_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilosc lat: ");
        int n = scanner.nextInt();

        System.out.print("Podaj kapital: ");
        BigDecimal k = scanner.nextBigDecimal();

        System.out.print("Podaj oprocentowanie: ");
        double p = scanner.nextDouble() / 100;

        BigDecimal tmp = new BigDecimal(p);

        for(int i = 0; i < n; i++)
        {
            k = k.add(k.multiply(tmp));
        }

        System.out.print("Kn = " + k.setScale(2, RoundingMode.HALF_EVEN));


    }
}
