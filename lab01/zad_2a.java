import java.util.Scanner;

public class zad_2a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj n: ");
        int n = scanner.nextInt();

        int answer = 0;

        for(int i = 0; i < n; i++){

            System.out.print("Podaj " + (i + 1) + " liczbę naturalną: ");
            int number = scanner.nextInt();

            if(!(number % 2 == 0)) answer += 1;
        }System.out.println("\nanswer = " + answer);
    }
}
