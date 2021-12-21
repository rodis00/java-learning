package pl.imiajd.sidor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {

    public static void main(String[] args) {

        ArrayList<Osoba> grupa = new ArrayList<>();

        grupa.add(new Osoba("Nosacz", LocalDate.of(2000, 12, 12)));
        grupa.add(new Osoba("Nosacz", LocalDate.of(2001, 11, 11)));
        grupa.add(new Osoba("Kalinowski", LocalDate.of(2000, 1, 18)));
        grupa.add(new Osoba("Sidor", LocalDate.of(2000, 1, 18)));
        grupa.add(new Osoba("Brzeczyszczykiewicz", LocalDate.of(1939, 8, 31)));

        for(Osoba osoba : grupa)
            System.out.println(osoba.toString());

        Collections.sort(grupa);
        System.out.println();

        for(Osoba osoba : grupa)
            System.out.println(osoba.toString());

    }
}
