import java.util.Scanner;

public class zad_2f {
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

            if((i + 1) % 2 != 0 && numbers[i] % 2 == 0) answer += 1;
        }
        System.out.println("\nanswer = " + answer);
    }
}
