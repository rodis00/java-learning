import java.util.Scanner;

public class zad_1e {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj str: ");
        String str = sc.nextLine();

        System.out.print("Podaj subStr: ");
        String subStr = sc.nextLine();

        int []tab = where(str, subStr);

        for (int i : tab) {
            System.out.print(i + " ");
        }
    }
    public static int countSubStr(String str, String subStr){
        int count = 0;
        String []tab = str.split(" ");
        for(String word : tab)
            if(word.equals(subStr))
                count += 1;
        return count;
    }

    public static int []where(String str, String subStr)
    {
        int []indexes = new int[countSubStr(str, subStr)];
        int idx = 0;
        int tmp = 0;

        while(true)
        {
            if(str.indexOf(subStr, tmp) != -1)
            {
                indexes[idx] = str.indexOf(subStr, tmp);
                tmp = str.indexOf(subStr, tmp) + 1;
                idx += 1;
            }
            else
                break;
        }
        return indexes;
    }
}
