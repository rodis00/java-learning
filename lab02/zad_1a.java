import java.util.Random;
import java.util.Scanner;

public class zad_1a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj n: ");
        System.out.print("--> ");
        int n = sc.nextInt();

        int parz = 0;
        int nie_parz = 0;
        if(n >= 1 && n <= 100)
        {
            int tab[] = new int[n];

            for(int i = 0 ; i < n; i++){
                int tmp = -999 + rand.nextInt(1000 + 999);
                tab[i] = tmp;
                if(tmp % 2 == 0) parz += 1;
                else nie_parz += 1;
            }
            System.out.println("parzyste = " + parz);
            System.out.println("nieparzyste = " + nie_parz);
        }
        else{
            System.out.println("n nie jest w zakresie 1<=n<=100");
        }
    }
}
