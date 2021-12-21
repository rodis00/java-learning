package pl.imiajd.sidor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zad_3 {
    public static void main(String[] args) throws FileNotFoundException {


        ArrayList<String> zad_3 = new ArrayList<>();
        File file = new File("src\\plik.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            zad_3.add(scanner.nextLine() + "\n");
        }
        scanner.close();

        System.out.println(zad_3);
        System.out.println();
        Collections.sort(zad_3);
        System.out.println(zad_3);
    }
}
