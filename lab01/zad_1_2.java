import java.util.Scanner;

public class zad_1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        double []numbers = new double[n];

        //wczytaj liczby
        for(int i = 0; i < n; i++){

            System.out.print("Podaj " + (i + 1) + " liczbę rzeczywistą: ");
            double number = scanner.nextDouble();
            numbers[i] = number;
        }

        //wypisz liczby kolejno
        System.out.print("\nanswer = ");
        for(int i = 1; i < n; i++){

            System.out.print(numbers[i] + ", ");
        }System.out.print(numbers[0]);

    }
}
