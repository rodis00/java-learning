import java.util.Scanner;

public class zad_2h {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();


        int []numbers = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++){

            System.out.print("Podaj " + (i + 1) + " liczbę naturalną: ");
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        for (int i = 0; i < n; i++){

            if (Math.abs(numbers[i]) < i * i) answer += 1;
        }
        System.out.println("\nanswer = " + answer);
    }
}
