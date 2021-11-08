import java.util.Scanner;

public class zad_1h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj str: ");
        String str = sc.nextLine();

        System.out.print("Podaj znak: ");
        String znak_str = sc.nextLine();
        char znak = znak_str.charAt(0);

        System.out.print("Podaj miejsce: ");
        int miejsce = sc.nextInt();

        System.out.println(nice(str, znak, miejsce));

    }
    public static String nice(String str, char znak, int miejsce)
    {
        StringBuffer sb = new StringBuffer();
        int licznik = 1;

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
            if(licznik == miejsce)
            {
                sb.append(znak);
                licznik = 0;
            }
            licznik += 1;
        }
        sb.reverse();
        return sb.toString();
    }
}
