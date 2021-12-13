package pl.imiajd.sidor;

import java.time.LocalDate;

public class Osoba {

    private String nazwisko;
    private String []imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec){

        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }

    public String showNames(){
        String names = "";
        for(String name : imiona)
            names += name + " ";
        return names;
    }

    public String rodzajPlci(){
        if(plec)
            return "mężczyzna";
        else
            return "kobieta";
    }

    public String toString() {
        String text = "";
        text += "Nazwisko: " + nazwisko +
                "\nImiona: " + showNames() +
                "\nData urodzenia: " + dataUrodzenia +
                "\nPlec: " + rodzajPlci() + "\n";
        return text;
    }
}
