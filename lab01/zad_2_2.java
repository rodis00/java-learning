import java.util.Scanner;

public class zad_2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        double sum = 0;

        for(int i = 0; i < n; i++){

            System.out.print("Podaj " + (i + 1) + " liczbę rzeczywistą: ");
            double number = scanner.nextDouble();

            if(number > 0) sum += number;
        }
        System.out.println("\nsum = " + sum * 2);
    }
}
