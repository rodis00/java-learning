package pl.imiajd.sidor;

import java.time.LocalDate;

public class Pracownik extends Osoba{

    private float pensja;
    private LocalDate dataZatrudnienia;

    public Pracownik(String nazwisko, String []imiona, LocalDate dataUrodzenia, boolean plec, LocalDate dataZatrudnienia, float pensja){
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.dataZatrudnienia = dataZatrudnienia;
        this.pensja = pensja;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
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
                "Data zatrudnienia: " + dataZatrudnienia + "\n" +
                "Pensja: " + pensja + "\n";
        return text;
    }
}
