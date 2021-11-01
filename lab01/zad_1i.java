import java.util.Scanner;

public class zad_1i {

    public static int silnia(int number){

        int result = 1;
        for(int i = 1; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        double result = 0;
        for(int i = 1; i <= n; i++){

            System.out.print("Podaj " + i + " liczbę rzeczywistą: ");
            double number = scanner.nextDouble();
            result += Math.pow(-1, i) * (number / silnia(i));
        }
        System.out.println("\nresult = " + result);

    }
}
