import java.util.Scanner;

public class zad_1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj napis: ");
        String str = sc.nextLine();
        System.out.println(repeat(str, 3));
    }
    public static String repeat(String str, int n)
    {
        String asnwer = "";
        for(int i = 0; i < n; i++)
        {
            asnwer += str;
        }
        return asnwer;
    }
}
