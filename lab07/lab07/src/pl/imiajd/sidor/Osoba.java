package pl.imiajd.sidor;

public class Osoba {

    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){

        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Nazwisko: " + nazwisko + ", Rok urodzenia: " + rokUrodzenia;
        return text;
    }
}
