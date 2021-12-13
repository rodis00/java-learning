import java.util.Random;

public class kolokwium_1b {

    public static void main(String[] args) {

        int []tab = stworz_tablice();
        wypisz_tablice(tab, 10);
        System.out.println("Max_value = " + wyznacz_maksimum(tab, 10));
        int []mniejsze = zwroc_mniejsze(tab, 10);
        wypisz_tablice(mniejsze, mniejsze.length);
    }

    public static int []stworz_tablice()
    {
        Random rand = new Random();
        int []tab = new int[10];

        tab[0] = 0;
        tab[1] = 1;
        for(int i = 2; i < 10; i++)
            tab[i] = -1 + rand.nextInt(4 + 1);
        return tab;
    }

    public static void wypisz_tablice(int []tab, int rozmiar)
    {
        for(int i = 0; i < rozmiar; i++)
            System.out.println(tab[i]);
        System.out.println();
    }

    public static double wyznacz_maksimum(int []tab, int rozmiar)
    {
        double max = tab[0];
        if(rozmiar == 0)
            return -1.0;

        for(int i = 0; i < rozmiar; i++)
        {
            if(tab[i] > max)
                max = tab[i];
        }
        return max;
    }

    public static int []zwroc_mniejsze(int []tab, int rozmiar)
    {
        int ile_mniejszych = 0;
        double max = wyznacz_maksimum(tab, rozmiar);
        for(int i = 0; i < rozmiar; i++)
        {
            if (tab[i] < max)
                ile_mniejszych++;
        }
        int []new_tab = new int[ile_mniejszych];

        if(rozmiar == 0)
            return new_tab;

        int j = 0;
        for(int i = 0; i < rozmiar; i++)
        {
            if(tab[i] < max)
            {
                new_tab[j] = tab[i];
                j++;
            }
        }
        return new_tab;
    }
}

