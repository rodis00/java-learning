import java.util.Scanner;

public class zad_2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for(int i = 0; i < n; i++){

            System.out.print("Podaj " + (i + 1) + " liczbę rzeczywistą: ");
            double number = scanner.nextDouble();

            if(number > 0) positive += 1;
            else if(number < 0) negative += 1;
            else zeros += 1;
        }
        System.out.println("\ndodatnie = " + positive);
        System.out.println("ujemne = " + negative);
        System.out.println("zera = " + zeros);
    }
}
