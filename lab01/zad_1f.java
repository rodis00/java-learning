import java.util.Scanner;

public class zad_1f {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        double result = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Podaj " + (i + 1) + " liczbę rzeczywistą: ");
            double number = scanner.nextDouble();
            result += Math.pow(number, 2);
        }
        System.out.println("\nWynik = " + result);
    }
}
