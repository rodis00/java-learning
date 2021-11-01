import java.util.Scanner;

public class zad_2d {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        int answer = 0;
        int []numbers = new int[n];
        for (int i = 0; i < n; i++){

            System.out.print("Podaj " + (i + 1) + " liczbę naturalną: ");
            int number = scanner.nextInt();
            numbers[i] = number;
            }

        for (int i = 0; i < n - 1; i++){
            if(i > 0 && ((numbers[i - 1] + numbers[i + 1]) / 2) > numbers[i]) answer += 1;
        }
        System.out.println("\nanswer = " + answer);
    }
}
