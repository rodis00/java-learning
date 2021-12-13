package pl.imiajd.sidor;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<>();

        orkiestra.add(new Flet("Ellise", LocalDate.of(1999,12,12)));
        orkiestra.add(new Fortepian("Steinway&Sons", LocalDate.of(2003, 8, 9)));
        orkiestra.add(new Skrzypce("Stagg", LocalDate.of(1998, 11, 24)));
        orkiestra.add(new Skrzypce("Suzuki", LocalDate.of(2002, 9, 3)));
        orkiestra.add(new Flet("Mollenhauer", LocalDate.of(2005, 6, 14)));

        for (Instrument instrument : orkiestra){
            System.out.print(instrument);
            System.out.println(instrument.getDzwiek() + "\n");
        }

        System.out.println(orkiestra.get(0).equals(orkiestra.get(4)));
        System.out.println(orkiestra.get(1).equals(orkiestra.get(3)));
    }
}
