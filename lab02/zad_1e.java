import java.util.Random;
import java.util.Scanner;

public class zad_1e {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj n: ");
        System.out.print("--> ");
        int n = sc.nextInt();


        if(n >= 1 && n <= 100) {
            int tab[] = new int[n];

            for (int i = 0; i < n; i++) {
                int tmp = -999 + rand.nextInt(1000 + 999);
                tab[i] = tmp;
            }
            show(tab);
            int tmp = 0;
            int najdluzszy = 0;

            for(int i = 0; i < n; i++)
            {
                if(tab[i] > 0)
                {
                    tmp += 1;
                    if(tmp > najdluzszy) najdluzszy = tmp;
                }
                if(tab[i] < 0)
                    tmp = 0;
            }
            System.out.println("najdluzszy = " + najdluzszy);

        }
            else{
            System.out.println("n nie jest w zakresie 1<=n<=100");
        }
    }
    public static void show(int []tab)
    {
        for(int num : tab)
            System.out.print(num + ", ");
        System.out.println();
    }
}
