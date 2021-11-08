import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad_2 {
    public static void main(String[] args){

        int count = 0;
        char znak = 'a';
        try {

            File file = new File("test.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNext())
            {
                String line = sc.nextLine();
                System.out.println(line);
                for(int i = 0; i < line.length(); i++)
                {
                    if(line.charAt(i) == znak)
                    {
                        count += 1;
                    }
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie mozna odnalezc okreslonego pliku");
        }
        System.out.println("\nZnak '" + znak + "' wystapil: " + count + " razy");
    }
}

