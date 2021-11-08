import java.util.Scanner;

public class zad_1g {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj str: ");
        String str = sc.nextLine();

        System.out.println(nice(str));
    }
    public static String nice(String str)
    {
        StringBuffer sb = new StringBuffer();
        int licznik = 1;

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
            if(licznik == 3)
            {
                sb.append('"');
                licznik = 0;
            }
            licznik += 1;
        }
        sb.reverse();
        return sb.toString();
    }
}
