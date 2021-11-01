import java.util.Random;
import java.util.Scanner;

public class zad_1f {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj n: ");
        System.out.print("--> ");
        int n = sc.nextInt();

        if(n >= 1 && n <= 100)
        {
            int tab[] = new int[n];

            for(int i = 0 ; i < n; i++){
                int tmp = -999 + rand.nextInt(1000 + 999);
                if(tmp < 0)
                    tab[i] = -1;

                else if(tmp > 0)
                    tab[i] = 1;
            }
            for(int num : tab)
            {
                System.out.print(num + ", ");
            }
        }
        else{
            System.out.println("n nie jest w zakresie 1<=n<=100");
        }
    }
}
