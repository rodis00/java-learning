import java.util.Random;

public class kolokwium_1a {
    public static void main(String[] args) {

        double []tab = stworz_tablice();
        wypisz_tablice(tab, 10);
        System.out.println("srednia = " + policz_srednia(tab, 10));
        double []mniejsze = zwroc_mniejsze(tab, 10);
        wypisz_tablice(mniejsze, mniejsze.length);
    }
    static double []stworz_tablice(){
        Random rand = new Random();
        double []tab = new double[10];
        tab[0] = 0;
        tab[1] = 1;
        double los;
        for(int i = 2; i < 10; i++){
            los = Math.round(-1 + rand.nextDouble() * 4);
            tab[i] = los;
        }
        return tab;
    }
    static void wypisz_tablice(double []tab, int rozmiar){
        for(int i = 0; i < rozmiar; i++)
            System.out.println(tab[i]);
        System.out.println();
    }
    static double policz_srednia(double []tab, int rozmiar){
        if(rozmiar == 0)
            return -1;

        double suma = 0;
        for(int i = 0; i < rozmiar; i++)
            suma += tab[i];

        double srednia = suma / rozmiar;

        return srednia;
    }
    static double []zwroc_mniejsze(double []tab, int rozmiar){
        int ile_mniejszych = 0;
        double srednia = policz_srednia(tab, rozmiar);
        for(int i = 0; i < rozmiar; i++)
            if(tab[i] < srednia)
                ile_mniejszych++;

        double []new_tab = new double[ile_mniejszych];
        int j = 0;
        for(int i = 0; i < rozmiar; i++){
            if(tab[i] < srednia)
            {
                new_tab[j] = tab[i];
                j++;
            }
        }
        return new_tab;
    }
}