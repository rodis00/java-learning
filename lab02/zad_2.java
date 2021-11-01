import java.util.Random;
import java.util.Scanner;

public class zad_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj n: ");
        System.out.print("--> ");
        int n = sc.nextInt();

        if(n >= 1 && n <= 100)
        {
            int tab[] = new int[n];
            generuj(tab, n, -999, 999);

            show(tab);
            System.out.println();

            int nieparzyste = ileNieparzystych(tab);
            System.out.println("Nieparzyste = " + nieparzyste);

            int parzyste = ileParzystych(tab);
            System.out.println("Parzyste = " + parzyste);

            int dodatnie = ileDodatnich(tab);
            System.out.println("Dodatnie = " + dodatnie);

            int ujemne = ileUjemnych(tab);
            System.out.println("Ujemne = " + ujemne);

            int zera = ileZerowych(tab);
            System.out.println("Zera = " + zera);

            int maksymalne = ileMaksymalnych(tab);
            System.out.println("Maksymalnych = " + maksymalne);

            int suma_dodatnich = sumaDodatnich(tab);
            System.out.println("Suma dodatnich = " + suma_dodatnich);

            int suma_ujemnych = sumaUjemnych(tab);
            System.out.println("Suma ujemnych = " + suma_ujemnych);

            int dlugosc_max_ciagu_dod = dlugoscMaksymalnegoCiaguDodatnich(tab);
            System.out.println("Dlugosc Maksymalnego Ciagu Dodatnich = " + dlugosc_max_ciagu_dod);


            System.out.println();
            show(tab);
            System.out.println("Odwrocone:");
            odwrocFragment(tab, 0, 1);

            System.out.print("signum = ");
            signum(tab);

        }
        else{
            System.out.println("n nie jest w zakresie 1<=n<=100");
        }
    }

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc)
    {
        Random rand = new Random();
        for(int i = 0; i < n; i++)
        {
            int tmp = minWartosc + rand.nextInt(maxWartosc + 1 - minWartosc);
            tab[i] = tmp;
        }
    }

    public static int ileNieparzystych(int []tab)
    {
        int how_much = 0;
        for(int num : tab)
            if(num % 2 != 0) how_much += 1;

        return how_much;
    }

    public static int ileParzystych(int []tab)
    {
        int how_much = 0;
        for(int num : tab)
            if(num % 2 == 0) how_much += 1;

        return how_much;
    }

    public static int ileDodatnich(int []tab)
    {
        int how_much = 0;
        for(int num : tab)
            if(num > 0) how_much += 1;

        return how_much;
    }

    public static int ileUjemnych(int []tab)
    {
        int how_much = 0;
        for(int num : tab)
            if(num < 0) how_much += 1;

        return how_much;
    }

    public static int ileZerowych(int []tab)
    {
        int how_much = 0;
        for(int num : tab)
            if(num == 0) how_much += 1;

        return how_much;
    }

    public static int ileMaksymalnych(int []tab)
    {
        int how_much = 0;
        int max = tab[0];

        for(int num : tab)
            if(num > max) max = num;

         for(int num : tab)
             if(num == max) how_much += 1;

        return how_much;
    }

    public static int sumaDodatnich(int []tab)
    {
        int how_much = 0;
        for(int num : tab)
            if(num > 0) how_much += num;

        return how_much;
    }

    public static int sumaUjemnych(int []tab)
    {
        int how_much = 0;
        for(int num : tab)
            if(num < 0) how_much += num;

        return how_much;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int []tab)
    {
        int tmp = 0;
        int najdluzszy = 0;
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > 0)
            {
                tmp += 1;
                if(tmp > najdluzszy)
                    najdluzszy = tmp;
            }
            if(tab[i] < 0)
                tmp = 0;
        }
        return najdluzszy;
    }


    public static void signum(int []tab)
    {
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > 0) tab[i] = 1;
            else if(tab[i] < 0) tab[i] = -1;
        }
        for(int num : tab)
            System.out.print(num + ", ");
    }

    public static void odwrocFragment(int []tab, int lewy, int prawy)
    {
        for(int i = 0; i < tab.length; i++)
        {
            int tmp_l = tab[lewy];
            int tmp_p = tab[prawy];

            tab[lewy] = tmp_p;
            tab[prawy] = tmp_l;
        }
        for(int num: tab)
        {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public static void show(int []tab)
    {
        for(int num : tab)
            System.out.print(num + ", ");
        System.out.println();
    }
}
