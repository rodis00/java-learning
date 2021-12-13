package pl.imiajd.sidor;

import java.time.LocalDate;

public class Student extends Osoba{

    private String kierunek;
    private double sredniaOcen;

    public Student(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, String kierunek) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public String getNazwisko() {
        return super.getNazwisko();
    }

    public String[] getImiona(){
        return super.getImiona();
    }

    public LocalDate getDataUrodzenia() {
        return super.getDataUrodzenia();
    }

    public boolean isPlec(){
        return super.isPlec();
    }

    public String toString() {
        String text = "";
        text += super.toString() +
                "Srednia ocen: " + sredniaOcen + "\n" +
                "Kierunek: " + kierunek + "\n";
        return text;
    }
}