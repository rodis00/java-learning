import java.util.Scanner;

public class zad_1f {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj str: ");
        String str = sc.nextLine();

        System.out.println(change(str));
    }

    public static String change(String str)
    {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++)
            if(Character.isUpperCase(str.charAt(i)))
                sb.append(Character.toLowerCase(str.charAt(i)));
            else
                sb.append(Character.toUpperCase(str.charAt(i)));

            return sb.toString();
    }
}
