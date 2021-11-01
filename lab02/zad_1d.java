import java.util.Random;
import java.util.Scanner;

public class zad_1d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj n: ");
        System.out.print("--> ");
        int n = sc.nextInt();

        int ujemne_sum = 0;
        int dodatnie_sum = 0;
        if(n >= 1 && n <= 100)
        {
            int tab[] = new int[n];

            for(int i = 0 ; i < n; i++){
                int tmp = -999 + rand.nextInt(1000 + 999);
                tab[i] = tmp;
                if(tmp < 0) ujemne_sum += tmp;
                else dodatnie_sum += tmp;
            }
            System.out.println("dodatnie suma = " + dodatnie_sum);
            System.out.println("ujemne suma = " + ujemne_sum);
        }
        else{
            System.out.println("n nie jest w zakresie 1<=n<=100");
        }
    }
}
