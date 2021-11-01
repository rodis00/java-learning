import java.util.Scanner;

public class zad_2_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        double []numbers = new double[n];

        for(int i = 0; i < n; i++){

            System.out.print("Podaj " + (i + 1) + " liczbę rzeczywistą: ");
            double number = scanner.nextDouble();
            numbers[i] = number;
        }

        int answer = 0;
        for(int i = 0; i < n-1; i++){

            double a = numbers[i];
            double b = numbers[i+1];

            if(a > 0 && b > 0) {
                answer += 1;
                System.out.print("(" + a + "," + b + ")");
            }
        }
        System.out.println("\nanswer = " + answer);
    }
}
