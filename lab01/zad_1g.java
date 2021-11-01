import java.util.Scanner;

public class zad_1g {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        double result_1 = 0;
        double result_2 = 1;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj " + (i + 1) + " liczbę rzeczywistą: ");
            double number = scanner.nextDouble();
            result_1 += number;
            result_2 *= number;
        }
        System.out.println("\nWynik = " + result_1 + " oraz " + result_2);
    }
}
