import java.math.BigInteger;
import java.util.Scanner;

public class zad_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("podaj wymiary tablicy: ");
        int n = sc.nextInt();

        BigInteger ziarno = new BigInteger("1");
        BigInteger count = new BigInteger("0");

        BigInteger [][]tab = new BigInteger[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
            {
                tab[i][j] = ziarno;
                count = count.add(ziarno);
                ziarno = ziarno.multiply(new BigInteger("2"));
            }

        print_tab(tab, n);
        System.out.println("\nsuma ziarna = " + count);
    }
    public static void print_tab(BigInteger [][]tab, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
