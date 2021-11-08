import java.util.Scanner;

public class zad_1c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj napis: ");
        String str = sc.nextLine();

        System.out.println(middle(str));
    }
    public static String middle(String str)
    {
        String znak = "";
        if(!(str.length() % 2 == 0))
            znak = Character.toString(str.charAt(str.length() / 2));
        else{
            String tmp_1 = Character.toString(str.charAt(str.length() / 2 - 1));
            String tmp_2 = Character.toString(str.charAt(str.length() / 2));
            znak = tmp_1 + tmp_2;
        }
        return znak;
    }
}
