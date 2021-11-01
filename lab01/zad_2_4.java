import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad_2_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        double []numbers = new double[n];

        //wczytywanie danych
        for(int i = 0; i < n; i++){

            System.out.print("Podaj " + (i + 1) + " liczbę rzeczywistą: ");
            double number = scanner.nextDouble();
            numbers[i] = number;
        }

        //szukanie min i max
        double min = numbers[0];
        double max = numbers[0];

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] > max) max = numbers[i];
            else if(numbers[i] < min) min = numbers[i];
        }

        System.out.print("\nmax = " + max);
        System.out.print("\nmin = " + min);

    }
}
