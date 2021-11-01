import java.util.Random;
import java.util.Scanner;

public class zad_1b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Podaj n: ");
        System.out.print("--> ");
        int n = sc.nextInt();

        int ujemne = 0;
        int dodatnie = 0;
        int zera = 0;
        if(n >= 1 && n <= 100)
        {
            int tab[] = new int[n];

            for(int i = 0 ; i < n; i++){
                int tmp = -999 + rand.nextInt(1000 + 999);
                tab[i] = tmp;
                if(tmp < 0) ujemne += 1;
                else if(tmp == 0) zera += 1;
                else dodatnie += 1;
            }
            System.out.println("ujemne = " + ujemne);
            System.out.println("dodatnie = " + dodatnie);
            System.out.println("zera = " + zera);
        }
        else{
            System.out.println("n nie jest w zakresie 1<=n<=100");
        }
    }
}
