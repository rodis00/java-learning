import java.util.Random;
import java.util.Scanner;

public class zad_1g {
    public static void main(String[] args) {

//        wczyta dwie liczby całkowite do
//        zmiennychlewyiprawy(1≤lewy < n,1≤prawy <n),
//        a następnie odwróci kolejność elementów we
//        fragmencie tablicy wyznaczonymprzez wartości
//        tych zmiennych.
//        g)  powinno być 1 <= lewy <= prawy <= n przy indeksowaniu
//        od 1 albo 0 <= lewy <= prawy < n przy indeksowaniu od 0.

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
                tab[i] = tmp;
            }
            System.out.print("Lewy = ");
            int lewy = sc.nextInt();

            System.out.print("Prawy = ");
            int prawy = sc.nextInt();

            for(int num : tab)
            {
                System.out.print(num + ", ");
            }
            if(lewy >= 0 && lewy <= prawy && lewy <= n && prawy <= n)
            {
                int tmp_l = tab[lewy];
                int tmp_p = tab[prawy];
                tab[lewy] = tmp_p;
                tab[prawy] = tmp_l;
            }
            else{
                System.out.println("powinno być 1 <= lewy <= prawy <= n");
            }
            System.out.println();
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
