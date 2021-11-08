import java.util.Scanner;

public class zad_1b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj str: ");
        String str = sc.nextLine();

        System.out.print("Podaj subStr: ");
        String subStr = sc.nextLine();

        System.out.println("CountSubStr = " + countSubStr(str, subStr));
    }

    public static int countSubStr(String str, String subStr){
        int count = 0;
        String []tab = str.split(" ");
        for(String word : tab)
            if(word.equals(subStr))
                count += 1;
        return count;
    }
}
