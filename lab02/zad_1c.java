import java.util.Random;
import java.util.Scanner;

public class zad_1c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj n: ");
        System.out.print("--> ");
        int n = sc.nextInt();

        int max = 0;
        int how_many = 0;
        if(n >= 1 && n <= 100)
        {
            int tab[] = new int[n];

            for(int i = 0 ; i < n; i++){
                int tmp = -999 + rand.nextInt(1000 + 999);
                tab[i] = tmp;
            }
            for(int i = 1; i < n; i++)
            {
                max = tab[0];
                if(tab[i] > max) max = tab[i];
            }
            for(int num : tab)
            {
                if(max == num) how_many += 1;
            }
            System.out.println("max = " + max);
            System.out.println("ile = " + how_many);
        }
        else{
            System.out.println("n nie jest w zakresie 1<=n<=100");
        }
    }
}
