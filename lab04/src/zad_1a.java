import java.util.Scanner;

public class zad_1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj napis: ");
        String str = sc.nextLine();

        System.out.print("Podaj znak: ");
        String c_string = sc.nextLine();
        char c = c_string.charAt(0);

        System.out.println("ilosc liter " + c + " = " + countChar(str, c));
    }


    public static int countChar(String str, char c){
        int count = 0;
        char[]tab = str.toCharArray();
        for(char letter : tab)
            if(letter == c)
                count += 1;
        return count;
    }
}
