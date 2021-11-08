import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad_3 {
    public static void main(String[] args) {

        int count = 0;
        String subStr = "Ala";

        try {
            File file = new File("test.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext())
            {
                String line = sc.nextLine();
                System.out.println(line);

                String []tab = line.split(" ");

                for(int i = 0; i < tab.length; i++)
                {
                    if(tab[i].equals(subStr))
                    {
                        count += 1;
                    }
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie znaleziono pliku");
        }
        System.out.println("\nWyraz '" + subStr + "' wystapil: " + count + " razy");
    }
}
