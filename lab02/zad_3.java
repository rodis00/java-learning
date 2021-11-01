import java.util.Random;
import java.util.Scanner;

public class zad_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj 3 liczby calkowite z przedzialu [1 ; 10]:");

        System.out.print("n: ");
        int n = sc.nextInt();

        System.out.print("m: ");
        int m = sc.nextInt();

        System.out.print("k: ");
        int k = sc.nextInt();


        int [][]a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = rand.nextInt(10);

        System.out.println("Macierz a:");
        show(a, n, m);

        int [][]b = new int[m][k];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < k; j++)
                b[i][j] = rand.nextInt(10);

        System.out.println("\nMacierz b:");
        show(b, m, k);

        int [][]c = new int[n][k];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < k; j++)
            {
                c[i][j] = 0;
                for(int l = 0; l < m; l++)
                    c[i][j] += a[i][l] * b[l][j];
            }
        System.out.println("\nMacierz c:");
        show(c, n, k);
    }

    public static void show(int [][]tab, int value_1, int value_2)
    {
        for(int i = 0; i < value_1; i++)
        {
            System.out.print("[ ");
            for(int j = 0; j < value_2; j++)
            {
                System.out.print(tab[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
